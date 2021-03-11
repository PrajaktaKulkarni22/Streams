package abstraction;

abstract class Abstractt{
    public Abstractt(){
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a1();

    public void a2(){
        System.out.println("This is a normal method of abstract class");
    }
}

class AbstractChild extends Abstractt{

    @Override
    public void a1() {
        System.out.println("This is abstract method");
    }
}

public class AbstractionDemo1 {
    public static void main(String[] args) {
/*        AbstractChild ac=new AbstractChild();
        ac.a1();
        ac.a2();*/

        Abstractt ab=new AbstractChild();
        ab.a1();
        ab.a2();
    }

}
