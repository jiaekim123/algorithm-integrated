package backjoon;
// memory: 292092 kb
// time: 1400 ms
import java.util.*;

public class Backjoon10818{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int count = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int[] data = new int[count];
        for(int i = 0 ; i <count ; i++){
            data[i] = scanner.nextInt();
             
            if(data[i]>max){
                max = data[i];
            } 

            if(data[i]<min){
                min = data[i];
            }
        }
        System.out.println(min+" "+max);
        scanner.close();
    }

}
// memory: 306380 kb
// time: 2104 ms
// import java.util.*;

// // result is success but runtime is too long.
// // you just calculate only max, min number. not solt.
// public class Backjoon10818{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);        
//         int count = scanner.nextInt();
//         List<Integer> numList = new ArrayList<Integer>();
            
//         for(int i = 0 ; i <count ; i++){
//             int number = scanner.nextInt();
//             numList.add(number); 
//         }
//         Collections.sort(numList);
//         System.out.println(numList.get(0)+" "+numList.get(numList.size()-1));
//         scanner.close();
//     }

// }

