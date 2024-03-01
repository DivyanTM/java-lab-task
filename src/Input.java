import java.io.*;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) throws IOException{
        DataInputStream di=new DataInputStream(System.in);
        Scanner sc=new Scanner(System.in);
        InputStreamReader in =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.print("Enter a number : ");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.print("Enter a number : ");
        int b=Integer.parseInt(br.readLine());
        System.out.println(b);
    }
}
