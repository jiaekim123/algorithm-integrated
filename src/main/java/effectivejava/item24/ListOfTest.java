package effectivejava.item24;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 5, 6, 7, 1, 3, 4);
        Collections.sort(list, Integer::compare);
        System.out.println(list);
    }
}
