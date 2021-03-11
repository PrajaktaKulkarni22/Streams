package streams;

import java.util.Arrays;
import java.util.List;

public class LimitDemo1 {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("abc","pqr","lmn","xyz","ijk","hgf");

                list.stream()
                    .limit(3)
                    .forEach(s -> System.out.println(s));
    }
}
