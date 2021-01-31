package codility.lesson.lesson3.frogjump;

class Solution {
    public int solution(int X, int Y, int D) {
        if (X == Y) return 0;
        return (Y - X) % D == 0 ? (Y - X) / D : (Y - X) / D + 1;
    }
}