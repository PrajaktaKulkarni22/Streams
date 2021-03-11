package streams;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo1 {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5);

        int sum=list.stream()
                .reduce(100,(x,y)->x+y);

        System.out.println("Sum:"+sum);
    }
}
