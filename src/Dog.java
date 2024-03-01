import java.io.DataInputStream;
import java.io.IOException;

public class Dog {
    String breed;
    String color;
    int age;
    public void bark(){
        System.out.println("Barking");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void attributes() throws IOException {
        DataInputStream din=new DataInputStream(System.in);
        System.out.print("Enter breed : ");
        breed= din.readLine();
        System.out.print("Enter color : ");
       color=din.readLine();
        System.out.print("Enter age : ");
        age=Integer.parseInt(din.readLine());
        din.close();
        System.out.println("Breed : "+breed);
        System.out.println("Color : "+color);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) throws Exception{
        Dog d=new Dog();
        d.attributes();
        d.bark();
        d.eat();
        d.sleep();
    }
}
