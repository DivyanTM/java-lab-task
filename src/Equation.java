import java.util.Scanner;
public class Equation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        System.out.print("Enter a number : ");
        int b=sc.nextInt();
        int lhs= (int) Math.pow((a+b),3);
        int rhs=(int)Math.pow(a,3)+(3*(int)Math.pow(a,2)*b)+(3*a*(int)Math.pow(b,2))+(int)Math.pow(b,3);
        if(lhs==rhs){
            System.out.println("Equation proved");
        }else{
            System.out.println("Not proved");
        }
    }

}
