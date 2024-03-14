
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;

public class FoodItems {
    int price;
    String cust_name;

   int cust_id=10000000;
    String cust_phone;
    int choice;
    int f_choice;
    int quant;
    int total;
    String order;
    Scanner sc=new Scanner(System.in);
    public void getDetails(){
        System.out.println("WELCOME TO DIVYAN HOTEL\n______________________________________________");
        System.out.print("Name : ");
        cust_name=sc.nextLine();
        System.out.print("Phone : ");
        cust_phone=sc.nextLine();
        cust_id++;
    }
    public void getOrder(){
        System.out.println("1.Breakfast\n2.Morning Tea\n3.Lunch\n4.Evening Tea\n5.Dinner\n6.Beverages");
        System.out.print("Enter your choice : ");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Breakfast Menu\n________________________________");
                System.out.println("NO.\t\tFOOD\t\tQUANTITY\t\tPRICE");
                System.out.println("1\t\tidly\t\t2\t\tRs.50");
                System.out.println("2\t\tDosa\t\t1\t\tRs.150");
                System.out.println("3\t\tPoori\t\t1 Set\t\tRs.60");
                System.out.println("4\t\tPongal\t\t1\t\t60\n");
                noteOrder();
                switch(f_choice){
                    case 1:
                        calcPrice(50);
                        order="Idly";
                        price=50;
                        break;
                    case 2:
                        calcPrice(150);
                        order="Dosa";
                        price=150;
                        break;
                    case 3:
                        calcPrice(60);
                        price=60;
                        order="Poori";
                        break;
                    case 4:
                        calcPrice(60);
                        price=60;
                        order="Pongal";
                        break;
                    default:
                        System.out.println("invalid choice");
                        return;
                }
                break;
            case 2:
                System.out.println("MORNING TEA\n______________________________");
                System.out.println("NO.\t\tFOOD\t\tQUANTITY\t\tPRICE");
                System.out.println("1\t\tContinental\t\t1\t\t250");
                noteOrder();
                switch (f_choice){
                    case 1:
                        calcPrice(250);
                        price=250;
                        order="Continental";
                        break;
                    default:
                        System.out.println("invalid choice");
                        return;
                }
                break;
            case 3:
                System.out.println("LUNCH MNEU\n_________________________________");
                System.out.println("NO.\t\tFOOD\t\tQUANTITY\t\tPRICE");
                System.out.println("1\t\tFull meals\t\t1\t\t200");
                System.out.println("2\t\tBriyani\t\t1\t\t250");
                noteOrder();
                switch(f_choice){
                    case 1:
                        order="Full meals";
                        calcPrice(200);
                        price=200;
                        break;
                    case 2:
                        order="Briyani";
                        calcPrice(250);
                        price=250;
                        break;
                    default:
                        System.out.println("invalid choice ");
                        return;
                }
                break;
            case 4:
                System.out.println("EVENING TEA\n_________________________________");
                System.out.println("NO.\t\tFOOD\t\tQUANTITY\t\tPRICE");
                System.out.println("1\t\t Snacks with tea\t\t1\t\t50");
                noteOrder();
                switch (f_choice){
                    case 1:
                        calcPrice(50);
                        price=50;
                        order="Snacks with tea";
                        break;
                    default:
                        System.out.println("Invalid choice");
                        return;
                }
            break;

            case 5:
                System.out.println("DINNER MNEU\n_________________________________");
                System.out.println("NO.\t\tFOOD\t\tQUANTITY\t\tPRICE");
                System.out.println("1\t\tChapati\t\t1 set\t\t60");
                System.out.println("2\tParota\t1 set\t80");
                System.out.println("3\tNon\t1 set\t100");
                System.out.println("4\tDosa\t1\t150");
                noteOrder();
                switch(f_choice){
                    case 1:
                        calcPrice(60);
                        price=60;
                        order="Chapati";
                            break;
                    case 2:
                        calcPrice(80);
                        price=80;
                        order="Patota";
                            break;
                    case 3:
                        calcPrice(100);
                        price=100;
                        order="Non";
                        break;
                    case 4:
                        calcPrice(150);
                        price=150;
                        order="Dosa";
                        break;
                    default:
                        System.out.println("invalid Choce");
                        return;
                }
                break;
            case 6:
                System.out.println("BEVERAGES MNEU\n_________________________________");
                System.out.println("NO.\t\tFOOD\t\tQUANTITY\t\tPRICE");
                System.out.println("1\t\tSoft drinks\t\t1\t\t100");
                System.out.println("2\t\tcocktails\t\t1\t\t250");
                System.out.println("3\t\tMocktails\t\t1\t\t300");
                noteOrder();
                switch (f_choice){
                    case 1:
                        calcPrice(100);
                        price=100;
                        order="Soft Drinks";
                        break;
                    case 2:
                        calcPrice(250);
                        price=250;
                        order="Cocktails";
                        break;
                    case 3:
                        calcPrice(300);
                        price=300;
                        order="MockTails";
                        break;
                    default:
                        System.out.println("Invalid choice");
                        return;
                }
                break;
            default:
                System.out.println("invalid choice");
                return;

        }
    }
    public void noteOrder(){
        System.out.print("What do you want to have ? : ");
        f_choice=sc.nextInt();
        System.out.print("Quantity : ");
        quant=sc.nextInt();
    }
    public void calcPrice(int p){
        total=quant*p;
    }
    public void printBill(){
        System.out.println();
        System.out.println();
        System.out.println("__________________________________________________________");
        System.out.println("DIVYAN HOTEL\nSirkali,\n609115.\n");
        System.out.println("CUSTOMER NAME : "+cust_name);
        System.out.println("PHONE : "+cust_phone);
        System.out.println("CUSTOMER ID. : "+cust_id);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd  HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("DATE : "+now);
        System.out.println("____________________________________________________");
        System.out.println("NO.\t\tFOOD\t\tQUANTITY\t\tPRICE");
        System.out.println(1+"\t\t"+order+"\t\t"+quant+"\t\t"+price);
        System.out.println();
        System.out.println();
        System.out.println("TOTAL\t\t:"+"Rs."+total);
        System.out.println("____________________________________________________");
        System.out.println("Thankyou Visit again");
        System.out.println("____________________________________________________________");
    }
}
