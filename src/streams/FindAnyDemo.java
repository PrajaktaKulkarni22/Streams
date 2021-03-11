package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyDemo {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(5,88,20,50,100);

        Optional<Integer> any=list.stream()
                .findAny();

        if (any.isPresent()){
            System.out.println(any.get());
        }
        else {
            System.out.println("No value");
        }
    }
}
