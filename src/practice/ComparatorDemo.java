package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student(1,"A","Pune",20));
        list.add(new Student(2,"B","Pune",10));
        list.add(new Student(3,"C","Pune",15));
        list.add(new Student(4,"D","Pune",25));

        System.out.println("Before sorting:"+list);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        System.out.println("After sorting:"+list);

    }
}

class Student{
    private int id;
    private String name;
    private String city;
    private int age;

    public Student(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}