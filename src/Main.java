import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter value of b :");
        int b=sc.nextInt();
        Equation eq=new Equation(a,b);
        boolean proved=eq.prove();
        System.out.println("LHS : "+eq.lhs+"\nRHS : "+eq.rhs);
        if(proved){
            System.out.println("Equation proved");
        }else{
            System.out.println("Equation not proved");
        }

        System.out.println("\nSHEET CALCULATION\n________________________");
        System.out.print("Enter number of students : ");
        int s=sc.nextInt();
        System.out.print("Enter number of labs : ");
        int l=sc.nextInt();
        Sheets sh=new Sheets(s,l);
        System.out.println("Total sheets : "+sh.totalSheets());
        System.out.println("Total packets : "+sh.totalPackets());
    }
}
