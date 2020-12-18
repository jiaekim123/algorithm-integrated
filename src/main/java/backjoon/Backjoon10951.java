package backjoon;
import java.util.*;

public class Backjoon10951 {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          List<Integer> sumList = new ArrayList<Integer>();
          
          while (in.hasNextInt()){
            int a, b;
            a = in.nextInt();
            b = in.nextInt();
            sumList.add(calculate(a, b));
          }
          in.close();
          for (Integer sum : sumList){
            System.out.println(sum);
          }
     }
     public static int calculate(int a, int b) {
          return a + b;
     }

}