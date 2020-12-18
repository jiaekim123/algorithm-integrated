package backjoon;
import java.util.*;

public class Backjoon10869 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        System.out.println(sum(a,b));
        System.out.println(sub(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));
        System.out.println(remain(a,b));

        in.close();
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int remain(int a, int b) {
        return a % b;
    }

}