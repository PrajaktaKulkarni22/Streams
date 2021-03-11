package abstraction;

abstract class Animals{
    public abstract void cats();
    public abstract void dogs();
}

class Cats extends Animals{

    @Override
    public void cats() {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }
}

class Dogs extends Animals{

    @Override
    public void cats() {
        System.out.println("Cats meow");
    }

    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }
}

public class AbstractionAnimals {
    public static void main(String[] args) {
        Cats c=new Cats();
        Dogs d=new Dogs();

        c.cats();
        c.dogs();

        d.cats();
        d.dogs();
    }
}
