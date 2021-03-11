package forloop;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        int k=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many lines:");
        int num= sc.nextInt();

        for (int i=0;i<num;i++){
            for (int j=num-i;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=i+1;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
