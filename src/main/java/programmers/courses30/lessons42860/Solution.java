/*
    https://programmers.co.kr/learn/courses/30/lessons/42860
    [프로그래머스][탐욕법] 조이스틱 (level 3)
 */
package programmers.courses30.lessons42860;

class Solution {
    public int solution(String name) {
        char[] nameArr = name.toCharArray();
        int rightCount = getRightCount(nameArr);
        int leftCount = getLeftCount(nameArr);
        return  rightCount < leftCount ? rightCount : leftCount ;
    }
    private int getRightCount(char[] nameArr){
        int answer = 0;
        int size = nameArr.length - 1;
        while(size > 0 && nameArr[size] == 'A'){
            size--;
        }
        for (int i = 0; i <=size; i++){
            answer += getCount(nameArr[i]);
            answer++;
        }
        return answer-1;
    }
    private int getLeftCount(char[] nameArr){
        int answer = 0;
        int size = 1;
        while(size < nameArr.length-1 && nameArr[size] == 'A'){
            size++;
        }
        answer += getCount(nameArr[0]);
        answer++;
        for (int i = nameArr.length - 1; i >=size; i--){
            answer += getCount(nameArr[i]);
            answer++;
        }
        return answer-1;
    }
    private int getCount(char alphabet){
        int A = 65;
        int Z = 90;
        int up = (int)alphabet - A;
        int down = Z - (int)alphabet + 1;
        return (up < down) ? up : down;
    }
}
