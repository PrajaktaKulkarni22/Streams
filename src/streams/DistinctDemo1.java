package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctDemo1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,1,5,2,6);

        List<Integer> list1=
                list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("New list:"+list1);
    }
}
