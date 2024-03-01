import java.util.Scanner;

public class ArithmeticOperations {
    public void performOperations() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();
        System.out.println("Enter choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo Division\n");
        int opt = sc.nextInt();

        switch (opt) {
            case 1:
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case 2:
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case 3:
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println(a + "/" + b + "=" + (a / b));
                } else {
                    System.out.println("Cannot divided by zero");
                }
                break;
            case 5:
                if(b!=0){
                    System.out.println(a+"%"+b+"="+(a%b));
                }else{
                    System.out.println("Cannot divided by zero");
                }
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }

        }


