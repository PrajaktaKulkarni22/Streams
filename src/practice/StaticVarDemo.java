package practice;

import java.util.Scanner;

class Student1{
    int rollno;
    String name;
    static String college="Kaveri college";

    public Student1(int rollno,String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}

public class StaticVarDemo {
    public static void main(String[] args) {
       /* Student1 s1=new Student1(1,"Abc");
        Student1 s2=new Student1(2,"Xyz");

        s1.display();
        s2.display();*/

        Scanner sc=new Scanner(System.in);
       // Student1 s2=new Student1();
        for (int i=0;i<2;i++){
            System.out.println("Enter id:");
            int rollno=sc.nextInt();
            System.out.println("Enter name:");
            String name=sc.next();

            Student1 s1=new Student1(rollno,name);

            s1.display();

        }
       // s2.display();

    }
}
