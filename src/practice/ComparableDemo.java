package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComparableDemo {
    public void showEmployeeData(){
        List<Employee>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<2;i++){
            System.out.println("Enter employee id:");
            int id=sc.nextInt();

            System.out.println("Enter employee name:");
            String name=sc.next();

            System.out.println("Enter employee salary:");
            int sal=sc.nextInt();

            Employee e=new Employee(id,name,sal);
            list.add(e);
            Collections.sort(list);
        }
        System.out.println("Employee data:"+list);
    }

    public static void main(String[] args) {
        ComparableDemo cd=new ComparableDemo();
        cd.showEmployeeData();
    }

}

class Employee implements Comparable{
    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getSal() {
        return sal;
    }

    @Override
    public int compareTo(Object o) {
        int compareSal=((Employee)o).getSal();
        return this.sal-compareSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }


}
