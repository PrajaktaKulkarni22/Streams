package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstDemo1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,8,30,20);

        Optional<Integer> optionalInteger=list.stream()
                .findFirst();

        System.out.println("First element:"+optionalInteger.get());


    }
}
