package programmers.courses30.lesson92334;

import java.util.*;

/**
 * 설명 :https://programmers.co.kr/learn/courses/30/lessons/92334?language=java
 * 코딩테스트 연습
 * 2022 KAKAO BLIND RECRUITMENT
 * 신고 결과 받기
 **/
class Solution {
    private static final String DEFAULT_SPLIT_WORD = " ";
    private static final Integer REPORT_INDEX = 0;
    private static final Integer REPORTED_INDEX = 1;


    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, Integer> reportedMap = new HashMap<>();
        HashMap<String, ReportInfo> reportMap = new HashMap<>();

        for (String id : id_list) {
            reportMap.put(id, new ReportInfo());
            reportedMap.put(id, 0);
        }

        Set<String> reportSet = new HashSet<>();
        Collections.addAll(reportSet, report);
        for (String info : reportSet) {
            String[] keys = info.split(DEFAULT_SPLIT_WORD);
            reportMap.get(keys[REPORT_INDEX]).addReportList(keys[REPORTED_INDEX]);
            reportedMap.put(keys[REPORTED_INDEX], reportedMap.get(keys[REPORTED_INDEX]) + 1);
        }

        List<String> banList = convertBanList(reportedMap, k);
        return Arrays.stream(id_list).mapToInt(id -> reportMap.get(id).getEmailCount(banList)).toArray();
    }

    private List<String> convertBanList(HashMap<String, Integer> reportedMap, int k) {
        List<String> banList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : reportedMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= k) {
                banList.add(key);
            }
        }

        return banList;
    }

    private static class ReportInfo {
        private final List<String> reportList;

        public ReportInfo() {
            this.reportList = new ArrayList<>();
        }

        public void addReportList(String reportId) {
            this.reportList.add(reportId);
        }

        public int getEmailCount(List<String> banList) {
            int emailCount = 0;
            for (String banPerson : banList) {
                if (reportList.contains(banPerson)) {
                    emailCount++;
                }
            }
            return emailCount;
        }
    }
}