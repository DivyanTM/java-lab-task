import java.util.Scanner;

public class Main {
    public static void main(String[] args){
////        Prime numbers
//        PrimeNumber pn=new PrimeNumber();
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        pn.printPrimeNumbers(n);
//        System.out.println("\n");
//
////        Aritmatic operations
//        ArithmeticOperations ao=new ArithmeticOperations();
//        ao.performOperations();
//
//        A4 sheets

        Sheets s=new Sheets(66,3);
        System.out.println("Total sheets : "+s.totalSheets());
        System.out.println("Total packets : "+s.totalPackets());
    }
}