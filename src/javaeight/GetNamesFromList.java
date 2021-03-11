package javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GetNamesFromList {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        List<Customer>customerList=new ArrayList<>();


        for (int i=0;i<2;i++){
            System.out.println("Enter id:");
            int id=sc.nextInt();

            System.out.println("Enter name:");
            String name=sc.next();

            System.out.println("Enter city:");
            String city=sc.next();

            Customer c1=new Customer(id,name,city);
            customerList.add(c1);

        }

/*
        Customer c1=new Customer(1,"A","Pune");
        Customer c2=new Customer(2,"B","Mumbai");
        Customer c3=new Customer(3,"C","Thane");
*/

     /*   customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);
*/
        List<String> names=customerList
                .stream()
                .map(customer -> customer.getName())
                .collect(Collectors.toList());

        System.out.println("Names of customers are:"+names);

    }
}

class Customer{
    private int id;
    private String name;
    private String city;

    public Customer(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

   /* @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }*/
}
