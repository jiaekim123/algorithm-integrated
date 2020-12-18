package backjoon;
import java.util.*;

public class Backjoon9498 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score;
        score = in.nextInt();
        System.out.println(grades(score));
        in.close();
    }

    public static char grades(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }

}