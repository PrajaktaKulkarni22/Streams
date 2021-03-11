package abstraction;

abstract class Parent{
    abstract void message();
}

class Subclass1 extends Parent{

    @Override
    void message() {
        System.out.println("This is first subclass");
    }

    void method1(){
        System.out.println("Subclass's own method");
    }
}

class Subclass2 extends Parent{

    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        /*Subclass1 s1=new Subclass1();
        s1.message();
        s1.method1();
        Subclass2 s2=new Subclass2();
        s2.message();*/

        Parent p1=new Subclass1();
        p1.message();
        Parent p2=new Subclass2();
        p2.message();

    }
}
