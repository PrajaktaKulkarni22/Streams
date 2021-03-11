package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstDemo {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(8,22,7,29,50);
        System.out.println("Original list:"+list);

        Optional<Integer> first=list.stream()
                .findFirst();


        if (first.isPresent()){
            System.out.println("First element:"+first.get());
        }
        else {
            System.out.println("No value");
        }
    }
}
