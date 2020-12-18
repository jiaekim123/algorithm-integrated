package backjoon;
import java.util.*;

public class Backjoon2739 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stage = in.nextInt();
        printStars(stage);
        in.close();
    }

    public static void printStars(int stage) {
        for (int i = 1 ; i<= stage ; i++){
            for( int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}