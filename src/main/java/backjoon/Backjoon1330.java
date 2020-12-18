package backjoon;
import java.util.*;

public class Backjoon1330 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        System.out.println(compare(a, b));
        in.close();
    }

    public static String compare(int a, int b) {
        if (a > b) {
            return ">";
        } else if (a < b) {
            return "<";
        } else {
            return "==";
        }
    }

}