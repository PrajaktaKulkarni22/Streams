package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAndMap {
    public static void main(String[] args) {
        /*List<String> list= Stream.of("Pineapple","Apple","Pear","Guava","Grapes")
                .filter(s->s.startsWith("P"))
                .map(s->s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(list);
*/
        List<String> list= Arrays.asList("Pineapple","Apple","Pear","Guava","Grapes");
        System.out.println("Original list:"+list);

        List<String> newList=list
               .stream()
                .filter(s->s.startsWith("P"))
                .map(s->s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("New list:"+newList);
    }
}
