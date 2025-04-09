
import java.util.Scanner;
class Bank {
    private int accountNumber;
    private String accountHolderName;
    private String address;
    protected double initialAmount;
    private String phoneNumber;
    public Bank(int accountNumber, String accountHolderName, String
            address, double initialAmount,
                String phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.initialAmount = initialAmount;
        this.phoneNumber = phoneNumber;


    }
    public void getDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Initial Amount: ₹" + initialAmount);
        System.out.println("Phone Number: " + phoneNumber);
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public String getAddress() {
        return address;
    }
    public double getInitialAmount() {
        return initialAmount;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
class Balance extends Bank {
    public Balance(int accountNumber, String accountHolderName, String
            address,
                   double initialAmount, String phoneNumber) {
        super(accountNumber, accountHolderName, address, initialAmount,
                phoneNumber);
    }
    public void getBalance() {
        System.out.println("Balance: ₹" + getInitialAmount());
    }
}
class Deposit extends Bank {
    public Deposit(int accountNumber, String accountHolderName, String
            address,
                   double initialAmount, String phoneNumber) {
        super(accountNumber, accountHolderName, address, initialAmount,
                phoneNumber);
    }
    public void depositAmount(double amount) {
        initialAmount += amount;
        System.out.println("Deposited ₹" + amount);
        System.out.println("New Balance: ₹" + initialAmount);
    }
}
class Withdrawal extends Bank {
    public Withdrawal(int accountNumber, String accountHolderName, String


        address,
                      double initialAmount, String phoneNumber) {
        super(accountNumber, accountHolderName, address, initialAmount,
                phoneNumber);
    }
    public void getWithdrawn(double amount) {
        if (initialAmount >= amount) {
            initialAmount -= amount;
            System.out.println("Withdrawn ₹" + amount);
            System.out.println("New Balance: ₹" + initialAmount);
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }
}
class Transfer extends Bank {
    public Transfer(int accountNumber, String accountHolderName, String
            address,
                    double initialAmount, String phoneNumber) {
        super(accountNumber, accountHolderName, address, initialAmount,
                phoneNumber);
    }
    public void transferAmount(double amount, Bank recipient) {
        if (initialAmount >= amount) {
            initialAmount -= amount;
            recipient.initialAmount += amount;
            System.out.println(
                    "Transferred ₹" + amount + " to " +
                            recipient.getAccountHolderName());
            System.out.println("New Balance: ₹" + initialAmount);
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }
}
class BankManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank[] accounts = new Bank[100];
        int count = 0;
        while (true) {
            System.out.println("\n1. Add New Customer");
            System.out.println("2. View Customer Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Transfer Money");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = scanner.nextInt();

                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Address: ");
                    String address = scanner.next();
                    System.out.print("Enter Initial Amount: ");
                    double initialAmount = scanner.nextDouble();
                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.next();
                    accounts[count] = new Bank(accNo, name, address,
                            initialAmount, phone);
                    count++;
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    int accNumber = scanner.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getAccountNumber() == accNumber) {
                            accounts[i].getDetails();
                            found = true;
                            break;
                        }
                    }

                    if (!found)

                        System.out.println("Account not found!");
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getAccountNumber() == accountNumber
                                && accounts[i] instanceof Deposit) {
                            ((Deposit)
                                    accounts[i]).depositAmount(depositAmount);
                            found = true;
                            break;
                        }
                    }

                    if (!found)

                        System.out.println("Account not found or not eligible for deposit!");
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getAccountNumber() == accountNumber
                                && accounts[i] instanceof Withdrawal) {
                            ((Withdrawal)
                                    accounts[i]).getWithdrawn(withdrawAmount);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Account not found or not eligible for withdrawal!");
                    break;
                case 5:
                    System.out.print(
                            "Enter Account Number from which you want to transfer money: ");
                    int senderAccNo = scanner.nextInt();
                    System.out.print("Enter Account Number to which you want to transfer money: ");
                    int receiverAccNo = scanner.nextInt();
                    System.out.print("Enter Amount to Transfer: ");
                    double transferAmount = scanner.nextDouble();
                    Bank sender = null, receiver = null;
                    for (int i = 0; i < count; i++) {
                        if (accounts[i].getAccountNumber() == senderAccNo)
                        {
                            sender = accounts[i];
                        }
                        else if (accounts[i].getAccountNumber() ==
                                receiverAccNo) {
                            receiver = accounts[i];
                        }
                    }
                    if (sender != null && receiver != null && sender
                            instanceof Transfer) {
                        ((Transfer) sender).transferAmount(transferAmount,
                                receiver);
                    }
                    else {

                        System.out.println(
                                "Invalid Accounts or Sender is not eligible for transfer!");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice! Please enter a valid option.");
            }
        }
    }
}