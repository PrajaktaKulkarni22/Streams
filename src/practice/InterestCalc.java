package practice;

import java.util.Scanner;

public class InterestCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal:");
        int principal=sc.nextInt();
        System.out.println("Enter rate:");
        int rate=sc.nextInt();
        System.out.println("Enter time:");
        int time=sc.nextInt();

        double interest=(principal*rate*time)/100;
        System.out.println("Interest is:"+interest);
    }
}
