package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LimitDemo {
    public static void main(String[] args) {
        Stream<Integer>evenNumber=Stream.iterate(0,number->number+2);
        List<Integer>newList=evenNumber.limit(10)
                .collect(Collectors.toList());

        System.out.println(newList);
    }
}
