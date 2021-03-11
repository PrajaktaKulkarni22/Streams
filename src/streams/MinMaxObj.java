package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxObj {
    public static void main(String[] args) {
        List<Employee>list=new ArrayList<>();

        list.add(new Employee(1,"abc",30));
        list.add(new Employee(2,"pqr",40));
        list.add(new Employee(3,"lmn",55));
        list.add(new Employee(4,"xyz",28));
        list.add(new Employee(5,"ijk",35));

        Employee maxNumber=list.stream()
                .max(Comparator.comparing(Employee::getAge))
                .get();

        System.out.println("Maximum age of employee:"+maxNumber);

        Employee minNumber=list.stream()
                .min(Comparator.comparing(Employee::getAge))
                .get();

        System.out.println("Minimum age of employee:"+minNumber);

    }
}

class Employee{
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
