package practice;

public class TypecastingDemo {
    public static void main(String[] args) {
        int a=100;
        System.out.println("Value of a:"+a);

        double d=a;
        System.out.println("Value of d:"+d);

        double d1=100.5;
        System.out.println("Value of d1:"+d1);

        int a1= (int) d1;
        System.out.println("Value of a1:"+a1);

        String s="1234";
        Integer i=Integer.parseInt(s);
        System.out.println("Value of i:"+i);


    }
}
