package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GetAgeFromList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Student>list=new ArrayList<>();
        for (int i=0;i<2;i++){
            System.out.println("Enter id:");
            int id=sc.nextInt();
            System.out.println("Enter name:");
            String name=sc.next();
            System.out.println("Enter age:");
            int age=sc.nextInt();

            Student s=new Student(id,name,age);
            list.add(s);
        }

        List<Integer>age=list
                .stream()
                .map(x->x.getAge())
                .collect(Collectors.toList());

        System.out.println("Age of students:"+age);
    }
}

class Student{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
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

   /* @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/
}
