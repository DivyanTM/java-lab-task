import javax.swing.*;
import java.awt.*;

public class PasswordGenerator {
    private JFrame frame;
    private JLabel lc,uc,c,num,pw,length;
    private JCheckBox lcCheck,ucCheck,cCheck,numCheck;
    private JButton generate;

    public PasswordGenerator(){
        frame=new JFrame("Password Generator");
        frame.setSize(500,500);
        frame.getContentPane().setBackground(new Color(196, 243, 213));

        lc=new JLabel("Lower Case : ");
        lc.setBounds(50,100,100,10);
        frame.add(lc);

        uc=new JLabel("Upper Case : ");
        uc.setBounds(60,10,100,10);
        frame.add(uc);

    }
    public void show(){
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        PasswordGenerator pg=new PasswordGenerator();
        pg.show();
    }
}
