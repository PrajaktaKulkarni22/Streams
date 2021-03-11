package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("agh","abc","pqr","lmn","xyz");

       List<String> newlist=
               list.stream()
               .filter(x->x.startsWith("a"))
                       .sorted()
               .collect(Collectors.toList());

        System.out.println("New list:"+newlist);

    }
}
