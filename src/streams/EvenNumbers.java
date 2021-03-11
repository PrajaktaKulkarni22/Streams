package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 74, 29, 37, 55, 28, 100);
        System.out.println("Original list:" + list);

        List<Integer> newList = list
                .stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("New list:"+newList);
    }
}
