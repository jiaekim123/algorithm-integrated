package effectivejava.item24;

import java.util.*;

public class SortingMachine {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 6, 7, 1, 3, 4);
        Collections.sort(list, Comparator.comparingInt(o -> o));
        System.out.println(list);
    }

}
