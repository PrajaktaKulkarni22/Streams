package abstraction;

import java.util.Scanner;

abstract class Shape1{
    public abstract void rectangleArea(int length,int breadth);
    public abstract void sqaureArea(int side);
    public abstract void circleArea(int radius);
}

class Area1 extends Shape1{

    @Override
    public void rectangleArea(int length, int breadth) {
        int areaReactangle=length*breadth;
        System.out.println("Area of rectangle is:"+areaReactangle);
    }

    @Override
    public void sqaureArea(int side) {
        int areaSquare=side*side;
        System.out.println("Area of square is:"+areaSquare);
    }

    @Override
    public void circleArea(int radius) {
        final double pi=3.14;
        double areaCircle=pi*radius*radius;
        System.out.println("Area of circle is:"+areaCircle);
    }
}

public class AbstractionShapeLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rectangle[]=new int[4];
        int square[]= new int[4];
        int circle[]= new int[5];
        Area1 a1=new Area1();

        for (int i=0;i< rectangle.length;i++){
            System.out.println("Enter length:");
            int length=sc.nextInt();
            System.out.println("Enter breadth:");
            int breadth=sc.nextInt();

            a1.rectangleArea(length,breadth);
        }

        for (int i=0;i< square.length;i++){
            System.out.println("Enter side:");
            int side=sc.nextInt();

            a1.sqaureArea(side);
        }

        for (int i=0;i< circle.length;i++){
            System.out.println("Enter radius:");
            int radius=sc.nextInt();

            a1.circleArea(radius);
        }
    }
}
