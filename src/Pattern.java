import java.util.Scanner;

public class Pattern {
    Scanner sc=new Scanner(System.in);
    public void printPattern(){
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.println();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void printReversePattern(){
        System.out.print("Enter number of rows: ");
        int rows=sc.nextInt();
        System.out.println();
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern p=new Pattern();
        p.printPattern();
        p.printReversePattern();
    }
}
