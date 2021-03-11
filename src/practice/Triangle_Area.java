package practice;

import java.util.Scanner;

public class Triangle_Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter breadth of triangle:");
        double breadth=sc.nextDouble();
        System.out.println("Enter height of triangle:");
        double height=sc.nextDouble();

        double area_triangle=0.5*breadth*height;
        System.out.println("Area of triangle is:"+area_triangle);
    }
}
