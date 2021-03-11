package streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("abc","lmn","xyz","pqr");

        boolean match=list.stream()
                .anyMatch(str->str.contains("abc"));

        System.out.println(match);
    }
}
