package streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Mapdemo {


    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");

//        map.forEach((k,v)-> System.out.println(k+":"+v));

        Stream<Map.Entry<Integer,String>> streammap=map.entrySet().stream();
        Object[] arr=streammap.toArray();
        System.out.println(Arrays.toString(arr));

    }
}
