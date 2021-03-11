package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergedStrings {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("abc","","bc","efg","abcd","","jkl");
        List<String>filtered=list
                .stream()
                .filter(str->!str.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Original list:"+list);
        System.out.println("Filtered list:"+filtered);

        String mergedStrings=list
                .stream()
                .filter(str->!str.isEmpty())
                .collect(Collectors.joining(", "));

        System.out.println("Merged string:"+mergedStrings);
    }
}
