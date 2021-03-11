package abstraction;

import sun.security.mscapi.CPublicKey;

abstract class Shape{
    public abstract void rectangleArea(int length,int breadth);
    public abstract void squareArea(int side);
    public abstract void circleArea(int radius);
}

class Area extends Shape{

    @Override
    public void rectangleArea(int length, int breadth) {
        int areaRectangle=length*breadth;
        System.out.println("Area of rectangle is:"+areaRectangle);
    }

    @Override
    public void squareArea(int side) {
        int areaSquare=side*side;
        System.out.println("Area of square is:"+areaSquare);
    }

    @Override
    public void circleArea(int radius) {
        final double pi=3.14;
        double circleArea=pi*radius*radius;
        System.out.println("Area of circle is:"+circleArea);
    }
}

public class AbstractionShape {
    public static void main(String[] args) {
        Area ar=new Area();
        ar.rectangleArea(20,10);
        ar.squareArea(4);
        ar.circleArea(5);
    }
}
