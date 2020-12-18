package backjoon;


import java.util.*;

public class Backjoon10872 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number==0){
            System.out.println(1);
        } else {
            System.out.println(factorial(number));
        }
        scanner.close();
    }

    public static int factorial(int a) {
        if(a==1){
            return a;
        }
        return factorial(a-1)*a;
    }

}