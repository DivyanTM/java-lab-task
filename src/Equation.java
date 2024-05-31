import java.util.Scanner;
public class Equation {
    int a,b,lhs,rhs;

    public Equation(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public boolean prove(){
        lhs= (int) Math.pow((a+b),3);
        rhs=(int)Math.pow(a,3)+(3*(int)Math.pow(a,2)*b)+(3*a*(int)Math.pow(b,2))+(int)Math.pow(b,3);
        return lhs==rhs;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Equation eq=new Equation(a,b);
        System.out.print("lhs : "+eq.lhs+"\nrhs : "+eq.rhs);
        eq.prove()?System.out.println("equation proved"):System.out.println("equation not proved");
    }
}


