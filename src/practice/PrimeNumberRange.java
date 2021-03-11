package practice;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp;
        System.out.println("Enter lower number:");
        int lower=sc.nextInt();
        System.out.println("Enter higher number:");
        int higher=sc.nextInt();

        for (int i=lower;i<higher;i++){
/*
            if (i==0 || i==1)
                continue;
*/
            temp=0;

            for (int j=1;j<=i;j++){
                if (i%j==0){
                    temp=temp+1;
                }
            }
            if (temp==2){
                System.out.println(i);
            }
        }
    }
}
