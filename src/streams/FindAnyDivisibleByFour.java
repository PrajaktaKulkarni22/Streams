package streams;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAnyDivisibleByFour {
    public static void main(String[] args) {
        IntStream intStream=IntStream.of(45,81,16,10,2,25,30);
               // .parallel();

        intStream=intStream.filter(num->num%4==0);

        OptionalInt answer=intStream.findAny();
        if (answer.isPresent()){
            System.out.println(answer.getAsInt());
        }

    }
}
