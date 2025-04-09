import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Child{
    private final JFrame frame;

    JPanel panel;
    public Child(){
        frame = new JFrame("Swing app");
        frame.setSize(500,500);
//        panel=new JPanel();
//        panel.setBounds(100,80,250,100);


        JButton btn = new JButton("Button");
        btn.setBounds(150,220,140,30);
        btn.addActionListener(e -> {
            Color c;
            Random r=new Random();
            int n=r.nextInt(5);
            switch(n){
                case 0:
                    c=Color.BLUE;
                    break;
                case 1:
                    c=Color.black;
                    break;
                case 2:
                    c=Color.CYAN;
                    break;
                case 4:
                    c=Color.green;
                    break;
                case 5:
                    c=Color.YELLOW;
                    break;
                default:
                    c=Color.RED;
            }
//                panel.setBackground(c);
            frame.getContentPane().setBackground(c);
        });

        frame.add(btn);
//        frame.add(panel);

        frame.setLayout(null);
    }
    void show(){
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Child c=new Child();
        c.show();
    }
}

