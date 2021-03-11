package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class KeySet {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");

      //  Stream<Map.Entry<Integer,String>> streammap=map.entrySet().stream();
        Integer[] key=map.keySet().toArray(new Integer[0]);
        System.out.println(Arrays.toString(key));

    }
}
