package codility.never.test3;

class Solution {
    public int solution(int Y, String A, String B, String W) {
        boolean isLeapYear = (Y % 4 == 0) ? true : false;
        Month startMonth = Month.valueOf(A);
        Month endMonth = Month.valueOf(B);

        int holidayStartDay = getStartHoliday(WeekDay.valueOf(W), startMonth, isLeapYear);
        return getHolidayWeeks(startMonth, endMonth, holidayStartDay);
    }

    private int getStartHoliday(WeekDay startWeekDay, Month startMonth, boolean isLeapYear){
        int startMonthNum = startMonth.ordinal();
        Month[] months = Month.values();

        int sum = 0;
        for (int i = 0; i<startMonthNum; i++){
            sum += isLeapYear ? months[i].leapYearDays : months[i].days;
        }

        int startWeekDayOnMonth = (startWeekDay.ordinal() + sum % 7) % 7;
        int holidayStartDay = startWeekDayOnMonth == 0 ? 1 : 8 - startWeekDayOnMonth;
        return holidayStartDay;
    }

    private int getHolidayWeeks (Month startMonth, Month endMonth, int holidayStartDay){
        int answer = 0;
        int holidayMonth = startMonth.ordinal();
        int holidayDay = holidayStartDay;
        while (holidayMonth <= endMonth.ordinal()){
            if (holidayDay + 7 > Month.values()[holidayMonth].days) {
                holidayMonth++;
                holidayDay = holidayDay + 7 - Month.values()[holidayMonth].days;
            } else {
                holidayDay += 7;
            }
            answer++;
        }
        return answer - 1;
    }
}

enum Month {
    January("January", 31, 31),
    February("February", 28, 29),
    March("March", 31, 31),
    April("April", 30, 30),
    May("May", 31, 31),
    June("June", 30, 30),
    July("July", 31, 31),
    August("August", 31, 31),
    September("September", 30, 30),
    October("October", 31, 31),
    November("November", 30, 30),
    December("December", 31, 31),
    ;

    String name;
    int days;
    int leapYearDays;

    Month (String name, int days, int leapYearDays){
        this.name = name;
        this.days = days;
        this.leapYearDays = leapYearDays;
    }
}

enum WeekDay {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}