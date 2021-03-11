package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("abc","pqr","lmn","xyz");

        List<String> list1=list.stream()
                .map(x->x.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println("New list:"+list1);
    }
}
