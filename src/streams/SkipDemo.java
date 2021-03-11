package streams;

import java.util.Arrays;
import java.util.List;

public class SkipDemo {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("abc,","pqr","xyz","lmn","ijk","jfd");

        list.stream()
                .skip(2)
                .forEach(s -> System.out.println(s));
    }
}
