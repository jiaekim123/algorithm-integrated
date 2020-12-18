package programmers.courses30.lesson68986;

import java.util.ArrayList;
import java.util.List;

class Solution {
	public boolean solution(String[] phone_book) {
		PhoneBook phoneBook = new PhoneBook(phone_book);

		for (String number : phone_book) {
			if (phoneBook.isPhoneNumberInBook(new Phone(number)))
				return false;
		}
		return true;
	}

}

class PhoneBook {
	List<Phone> phoneList;

	public PhoneBook(String[] phoneBook) {
		phoneList = new ArrayList<Phone>();
		for (String number : phoneBook) {
			phoneList.add(new Phone(number));
		}
	}

	public boolean isPhoneNumberInBook(Phone phone) {
		if (phoneList.contains(phone)) {
			return true;
		}
		return false;
	}
}

class Phone {
	String number;

	public Phone(String number) {
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Phone) {
			Phone phone = (Phone) obj;
			if (this.number.equals(phone.number)) {
				return false;
			} else if (this.number.startsWith(phone.number) || phone.number.startsWith(this.number)) {
				return true;				
			}
		}
		return false;
	}
}

public class PhoneNumberList {

	public static void main(String[] args) {
		System.out.println(new Solution().solution(new String[] { "119", "97674223", "1195524421" }));
		System.out.println(new Solution().solution(new String[] { "123", "456", "789" }));
		System.out.println(new Solution().solution(new String[] { "12", "123", "1235", "567", "88" }));
	}

}
