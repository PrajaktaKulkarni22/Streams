package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Squares {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println("Original list:"+list);

        List<Integer>newList=list
                .stream()
                .map(square->square*square)
                .collect(Collectors.toList());

        System.out.println("New List:"+newList);
    }
}
