import java.util.Scanner;
public class Event {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER EVENT DETAILS\n***********************");
        System.out.print("Event name : ");
        String EventName=sc.nextLine();
        System.out.print("Type of event : ");
        String type=sc.nextLine();
        System.out.print("Number of people expected : ");
        int peopleExpected=sc.nextInt();
        System.out.print("whether the event is going to be a paid entry (Y/N) : ");
        char entry=sc.next().toLowerCase().charAt(0);
        String entryType=(entry=='y')?"Paid":"Free";
        System.out.print("Projected expenses (in lakhs) : ");
        double expenses=sc.nextDouble();

        System.out.println("\nEVENT DETAILS\n________________________\n");
        System.out.println("EVENT NAME :\t"+EventName);
        System.out.println("TYPE OF EVENT :\t"+type);
        System.out.println("NUMBER OF PEOPLE EXPECTED :\t"+peopleExpected);
        System.out.println("ENTRY TYPE :\t"+entryType);
        System.out.println("PROJECTED EXPENSES (IN LAKHS) :\t"+expenses+" INR");
    }
}
