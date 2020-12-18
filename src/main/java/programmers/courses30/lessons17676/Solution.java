/*
    https://programmers.co.kr/learn/courses/30/lessons/17676
    [프로그래머스][2018 KAKAO BLIND RECRUITMENT] 추석 트래픽 (level 3)
 */
package programmers.courses30.lessons17676;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        List<Traffic> trafficList = new ArrayList<Traffic>();
        for (String line : lines){
            trafficList.add(new Traffic(line));
        }

        // 요청량이 변하는 순간은 각 로그의 시작과 끝뿐이다.
        answer = getCountMax(trafficList, true, answer);
        answer = getCountMax(trafficList, false, answer);

        return answer;
    }
    private int getCountMax (List<Traffic> trafficList, boolean isStart, int maxCount){
        for (int i = 0; i <trafficList.size(); ++i){
            int count = 0;
            long startSection = isStart ? trafficList.get(i).startTime : trafficList.get(i).endTime;
            long endSection = startSection + 1000;

            for (int j = 0; j < trafficList.size(); ++j) {
                if ((startSection <= trafficList.get(j).startTime && trafficList.get(j).startTime < endSection)
                        || (startSection <= trafficList.get(j).endTime && trafficList.get(j).endTime < endSection)
                        || (trafficList.get(j).startTime<=startSection && endSection<=trafficList.get(j).endTime)) {
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}
class Traffic {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
    long startTime;
    long endTime;
    float processingTime;

    Traffic(String line){
        parseLog(line);
    }

    private void parseLog(String line){
        String[] logs = line.split(" ");
        this.processingTime = Float.parseFloat(logs[2].split("s")[0]);
        try {
            this.endTime = dateFormat.parse(logs[0] + " " + logs[1]).getTime();
            this.startTime = endTime - (long)(processingTime*1000) + 1;
        } catch (Exception e){
            System.out.println("데이터 포맷 에러");
            e.printStackTrace();
        }
    }
}