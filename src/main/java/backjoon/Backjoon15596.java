package backjoon;
import java.util.*;

public class Backjoon15596{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList= new ArrayList<Integer>();
        while(scanner.hasNextInt()){
            int number = scanner.nextInt();
            numberList.add(number);
        }
        int[] numberArray = new int[numberList.size()];
        for(int i=0;i<numberList.size();i++){
            numberArray[i]  = numberList.get(i);
        }
        long result = sum(numberArray);
        System.out.println(result);
        scanner.close();
    }
    private static long sum(int[] a){
        long sum = 0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        return sum;
    }
}