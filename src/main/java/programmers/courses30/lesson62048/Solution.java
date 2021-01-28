/*
    https://programmers.co.kr/learn/courses/30/lessons/62048
    [프로그래머스][Summer/Winter Coding(2019)] 멀쩡한 사각형 (leven 2)
 */
package programmers.courses30.lesson62048;

import java.math.BigInteger;

class Solution {
    public long solution(int w, int h) {
        // 최대공약수 구하기
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();

        // (w * h) - (((w / 최대공약수) + (h / 최대공약수) - 1) * 최대공약수)
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
    }
}