/*
    https://programmers.co.kr/learn/courses/30/lessons/12940
    [프로그래머스][연습문제] 최대공약수와 최소공배수
 */
package programmers.courses30.lesson12940;

class Solution {
    public int[] solution(int n, int m) {
        int gcd = gcdU(n, m);
        int lcm = lcm(n, m, gcd);
        return new int[] {gcd, lcm};
    }
    // 최대 공약수 (Greatest common factor)
    private int gcd(int n, int m){
        int gcd = 0;
        for (int i = 1; i<= Math.min(n, m); i++){
            if (n % i == 0 && m % i == 0) gcd = i;
        }
        return gcd;
    }
    // 최대 공약수 유클리드 호제법 (Greatest common factor)
    private int gcdU(int n, int m){
        while(m != 0){
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }
    // 최소 공배수 (Least common multiple)
    private int lcm(int n, int m, int gcd){
        return n * m / gcd;
    }
}