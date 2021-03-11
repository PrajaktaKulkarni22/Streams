package javaeight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {
    public static void main(String[] args) {
        Map<String,Integer>m1=new HashMap<>();
        m1.put("A",10);
        m1.put("B",20);
        m1.put("C",30);

        Map<String,Integer>m2=new HashMap<>();
        m2.put("D",100);
        m2.put("E",200);
        m2.put("F",300);

        Map<String,Integer>m3=new HashMap<>();
        m3.put("G",50);
        m3.put("H",60);
        m3.put("I",70);

        Map<String,Integer>m4=new HashMap<>();
        m4.put("J",80);
        m4.put("K",30);
        m4.put("L",40);

        List<Map<String,Integer>>list=new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        System.out.println("Traditional java");
        for (Map<String,Integer>map:list){
            for (Map.Entry<String,Integer> entry:map.entrySet()){
                System.out.println(entry.getKey()+":"+entry.getValue());
            }
        }

        System.out.println("Using java 8");
       list.forEach(a->
               a.forEach((k,v)-> System.out.println(k+":"+v))
               );
    }
}
