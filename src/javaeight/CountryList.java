package javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountryList {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("India","US","China","London","France");
        List<String>newList=list.stream()
                .filter(str->!"China".equals(str))
                .collect(Collectors.toList());

        System.out.println("Original list:"+list);
        System.out.println("New list:"+newList);
    }
}
