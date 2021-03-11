package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountryListSimple {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("India","US","China","Japan","France");
        List<String>list1=new ArrayList<>();

        for (int i=0;i<list.size();i++){
            if (list.get(i)!="China"){
                list1.add(list.get(i));
            }
        }

        System.out.println("Original list:"+list);
        System.out.println("New list:"+list1);
    }
}
