package practice;

class Animalss{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dogss extends Animalss{
    void bark(){
        System.out.println("Barking...");
    }
}

class Cat extends Animalss{
    void meow(){
        System.out.println("Meow...");
    }
}


public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();
        c.eat();

        Dogss d=new Dogss();
        d.bark();
        d.eat();
    }
}
