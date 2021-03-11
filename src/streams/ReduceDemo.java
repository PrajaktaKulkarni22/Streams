package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,7,10,80,65,100);

        list.stream()
                .reduce((x,y)->x+y)
                .ifPresent(System.out::println);

        List<String>stringList=Arrays.asList("abc","pqr","lmn","xyz");

        stringList.stream()
                .reduce((x,y)->x+"|"+y)
                .ifPresent(System.out::println);
    }
}
