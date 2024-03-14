import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {
    public String generatePassword(int n,char u,char s,char num){
        String lower="abcdefghijklmnopqrstuvwxyz";
        String upper=lower.toUpperCase();
        String special="~`@!$%^&*()_-=+[]{}\\|',.\"";
        String numbers="0123456789";
        StringBuilder src=new StringBuilder(lower);
        if(u=='y'){
            src.append(upper);
        }
        if(s=='y'){
            src.append(special);
        }
        if(num=='y'){
            src.append(numbers);
        }
        StringBuilder password=new StringBuilder();
        for(int i=1;i<=n;i++){
            Random r=new Random();
            int j=r.nextInt(src.length());
            password.append(src.charAt(j));
        }
        return password.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("RANDOM PASSWORD GENERATOR");
        System.out.println("-----------------------------------------------------------");
        System.out.print("LENGTH OF PASSWORD : ");
        int n=sc.nextInt();
        System.out.print("UPPERCASE (y/n) : ");
        char u=sc.next().charAt(0);
        System.out.print("SPECIAL CHARACTERS (y/n) : ");
        char s=sc.next().charAt(0);
        System.out.print("NUMBERS (y/n) : ");
        char num=sc.next().charAt(0);
        RandomPasswordGenerator gen=new RandomPasswordGenerator();
        String p=gen.generatePassword(n,u,s,num);
        System.out.println("PASSWORD : "+p);
    }
}
