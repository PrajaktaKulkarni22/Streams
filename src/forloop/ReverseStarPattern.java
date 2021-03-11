package forloop;

import java.util.Scanner;

public class ReverseStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int num=sc.nextInt();

        for (int i=0;i<num;i++){
            for (int j=i+1;j>1;j--){
                System.out.print(" ");
            }
            for(int j=num-2;j>=i-1;j--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
