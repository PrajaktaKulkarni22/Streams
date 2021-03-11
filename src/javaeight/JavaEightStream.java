package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEightStream {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("a","d","c","e","b");

        List<String> newList=list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("New list:"+newList);
    }
}


