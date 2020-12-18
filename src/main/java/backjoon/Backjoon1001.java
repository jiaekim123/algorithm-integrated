package backjoon;
import java.util.*;

public class Backjoon1001 {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int a;
          a = in.nextInt();
          int b;
          b = in.nextInt();
          int result;
          result = sub(a, b);
          System.out.println(result);
          in.close();
     }

     public static int sub(int a, int b) {
          return a - b;
     }

}