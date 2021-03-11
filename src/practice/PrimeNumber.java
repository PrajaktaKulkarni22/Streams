package practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;

        System.out.println("Enter any number:");
        int num=sc.nextInt();

        for (int i=2;i<num-1;i++){

            if (num%i==0){
                temp=temp+1;
            }
        }
        if (temp==0){
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }
    }
}
