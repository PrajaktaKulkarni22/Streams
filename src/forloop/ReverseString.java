package forloop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string:");
        String str=sc.next();

        for (int i=str.length();i>0;i--){
            System.out.print(str.charAt(i-1));
        }
    }
}
