package practice;

public class NullPointerExceptionPrg {
    public static void main(String[] args) {
      /*  int data[]=null;
        System.out.println(data.length);*/

        String[]str=new  String[10];
        String low=str[5].toLowerCase();
        System.out.println(low);
    }
}
