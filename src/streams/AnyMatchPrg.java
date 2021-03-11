package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatchPrg {
    public static void main(String[] args) {
        List<Students>list=new ArrayList<>();

        list.add(new Students(1,"Abc",25));
        list.add(new Students(2,"Pqr",20));
        list.add(new Students(3,"Xyz",15));
        list.add(new Students(4,"Lmn",23));

        boolean match1=list
                .stream()
                .anyMatch(students -> students.getName().startsWith("A"));
        System.out.println("Match1:"+match1);

        boolean match2=list
                .stream()
                .anyMatch(students -> students.getAge()<25 && students.getName().startsWith("A"));

        System.out.println("Match2:"+match2);

        boolean match3=list
                .stream()
                .allMatch(students -> students.getAge()<30);

        System.out.println("Match3:"+match3);
    }
}

class Students{
    private int id;
    private String name;
    private int age;

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}