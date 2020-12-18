package backjoon;
import java.util.*;

public class Backjoon2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        while (scanner.hasNextInt()) {
            
            int number = scanner.nextInt();
            if (number > max) {
                max = number;
                maxCount = count;
            }
            count++;
        }
        System.out.println(max);
        System.out.println(maxCount);
        scanner.close();
    }

}