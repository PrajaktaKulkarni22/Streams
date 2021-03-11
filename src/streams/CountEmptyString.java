package streams;

import java.util.Arrays;
import java.util.List;

public class CountEmptyString {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("abc","","pqr","","","lmn","xyz","");

        long count=list
                .stream()
                .filter(str->str.isEmpty())
                .count();

        System.out.println("Count of empty strings:"+count);
    }
}
