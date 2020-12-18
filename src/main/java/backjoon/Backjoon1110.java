package backjoon;
import java.util.*;

public class Backjoon1110 {

     public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int startNum = in.nextInt();
          int firstNum = startNum / 10;
          int secondNum = startNum % 10;
          int cicle = 0;
          while (true){
               cicle++;
               int newNum = secondNum*10 + (firstNum+secondNum)%10;
               firstNum = newNum / 10;
               secondNum  = newNum % 10;

               if(newNum == startNum){
                    break;
               }
          }
          in.close();
          System.out.println(cicle);
     }
}