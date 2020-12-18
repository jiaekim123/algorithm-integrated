package backjoon;
import java.util.*;

public class Backjoon10950 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        int[] a = new int[testCase];
        int[] b = new int[testCase];
        int[] sum = new int[testCase];

        for (int i = 0; i < testCase; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < testCase; i++) {
            sum[i] = solveMeFirst(a[i], b[i]);
            System.out.println(sum[i]);
        }
        scanner.close();
    }

    public static int solveMeFirst(int a, int b) {
        return a + b;
    }

}