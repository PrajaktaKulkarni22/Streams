package forloop;

public class ReverseNumPattern {
    public static void main(String[] args) {
        int num=4,k=10;
        for (int i=0;i<num;i++){
            for (int j=i+1;j>=1;j--){
                System.out.print(" ");
            }
            for (int j=num-2;j>=i-1;j--){
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }
}
