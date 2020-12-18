package backjoon;
import java.util.Scanner;

public class Backjoon2920 {
    private final static String RESULT_ASCENDING = "ascending";
    private final static String RESULT_DESCENDING = "descending";
    private final static String RESULT_MIXED = "mixed";

    private final static int MAX = 8;
    private final static int MIN = 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] scale = new int[MAX];
        String result = null;

        for (int i = 0; i < scale.length; i++) {
            scale[i] = in.nextInt();
            if (i == 0) {
                if (scale[i] == MIN){
                    result = RESULT_ASCENDING;
                } else if (scale[i] == MAX) {
                    result = RESULT_DESCENDING;
                } else {
                    result = RESULT_MIXED;
                }
            } else {
                int dif = scale[i] - scale[i - 1];
                if (dif == 1) {
                    result = RESULT_ASCENDING;
                } else if (dif == -1) {
                    result = RESULT_DESCENDING;
                } else {
                    result = RESULT_MIXED;
                    break;
                }
            }
        }
        System.out.println(result);
        in.close();
    }
}