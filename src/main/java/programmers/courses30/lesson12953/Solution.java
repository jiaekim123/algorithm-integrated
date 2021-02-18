/*
    https://programmers.co.kr/learn/courses/30/lessons/12953
    [프로그래머스][연습문제] N개의 최소공배수
 */
package programmers.courses30.lesson12953;

class Solution {
    public int solution(int[] arr) {
        return lcmN(arr);
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 최소 공배수
    private int lcmN(int[] arr){
        int lcm = arr[0];
        for (int i = 1; i<arr.length; i++){
            lcm = lcm(lcm, arr[i]);
        }
        return lcm;
    }

    private int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}