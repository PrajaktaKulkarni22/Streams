package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(2,7,20,50,100,200,500);

        int maxNumber=list.stream()
                .max(Comparator.comparing(val->Integer.valueOf(val)))
                .get();

        System.out.println("Max number:"+maxNumber);

        int minNumber=list.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();

        System.out.println("Min number:"+minNumber);
    }
}
