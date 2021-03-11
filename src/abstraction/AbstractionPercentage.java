package abstraction;

abstract class Marks{
    public abstract void getPercentage();
}

class A1 extends Marks{

    int sub1,sub2,sub3;
    int total=300;

    public A1(int sub1,int sub2,int sub3) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
    }

    @Override
    public void getPercentage() {
        int result=(sub1+sub2+sub3)*100/total;
        System.out.println("Percentage of student A1 is:"+result);
    }
}

class B1 extends Marks{

    int sub1,sub2,sub3,sub4;
    int total=400;

    public B1(int sub1,int sub2,int sub3,int sub4) {
        this.sub1=sub1;
        this.sub2=sub2;
        this.sub3=sub3;
        this.sub4=sub4;
    }

    @Override
    public void getPercentage() {
        int result=(sub1+sub2+sub3+sub4)*100/total;
        System.out.println("Percentage of student B1 is:"+result);

    }
}
public class AbstractionPercentage {
    public static void main(String[] args) {
        Marks m1=new A1(50,60,80);
        m1.getPercentage();

        Marks m2=new B1(50,60,40,90);
        m2.getPercentage();
    }

}
