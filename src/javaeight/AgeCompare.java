package javaeight;

import java.util.ArrayList;
import java.util.List;

public class AgeCompare {
    public static void main(String[] args) {
        List<Student>list=new ArrayList<>();
        list.add(new Student(10,"A","Pune",10));
        list.add(new Student(20,"B","Pune",20));
        list.add(new Student(30,"C","Pune",15));
        list.add(new Student(40,"D","Pune",9));

        System.out.println("Before sorting:"+list);

        list.sort((Student s,Student ss)->
                s.getAge()- ss.getAge());

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