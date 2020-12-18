package backjoon;
import java.util.*;

public class Backjoon10952 {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          List<Integer> sumList = new ArrayList<Integer>();
          
          while (true){
            int a, b;
            a = in.nextInt();
            b = in.nextInt();
            if(a == 0 && b == 0){
                in.close();
                break;
              }
            sumList.add(calculate(a, b));
          }
          for (Integer sum : sumList){
            System.out.println(sum);
          }
     }
     public static int calculate(int a, int b) {
          return a + b;
     }

}