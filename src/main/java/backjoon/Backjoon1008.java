package backjoon;
import java.util.*;

public class Backjoon1008 {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int a;
          a = in.nextInt();
          int b;
          b = in.nextInt();
          double sum;
          sum = calculate(a, b);
          System.out.println(sum);
          in.close();
     }

     public static double calculate(int a, int b) {
          return (double) a / (double) b;
     }

}