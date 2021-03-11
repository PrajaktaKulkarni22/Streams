package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("India","India","Japan","Australia","US");
        System.out.println("Original list:"+list);

        list.stream()
                .distinct()
                .forEach(System.out::println);

        list.stream()
                .distinct()
                .forEach(s -> System.out.println(s));


        List<String>newList=list
                .stream()
                .distinct()
                .collect(Collectors.toList());


        System.out.println("New list:"+newList);
    }
}
