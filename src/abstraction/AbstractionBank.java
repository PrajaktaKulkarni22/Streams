package abstraction;

abstract class Bank{
    public abstract int getBalance();
}

class A extends Bank{

    @Override
    public int getBalance() {
        return 100;
    }
}

class B extends Bank{

    @Override
    public int getBalance() {
        return 150;
    }
}

class C extends Bank{

    @Override
    public int getBalance() {
        return 200;
    }
}

public class AbstractionBank {
    public static void main(String[] args) {
        Bank bank=new A();
        int aBank= bank.getBalance();
        System.out.println("Balance in bank A:"+aBank);

        Bank bank1=new B();
        int bBank=bank1.getBalance();
        System.out.println("Balance in bank B:"+bBank);

        Bank bank2=new C();
        int cBank=bank2.getBalance();
        System.out.println("Balance in bank C:"+cBank);

    }
}
