package bank.management.system;
import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JLabel label1,label2,label3;
    Login() {
        super("Bank Management System");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);



        label1 = new JLabel("WELCOME TO ATM ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,28));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No. :");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,18));
        label2.setBounds(120,200,250,30);
        add(label2);

        label3 = new JLabel("Pin No.   :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,18));
        label3.setBounds(120,250,250,30);
        add(label3);

        label3 = new JLabel("Pin No.   :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,18));
        label3.setBounds(120,250,250,30);
        add(label3);

        passwordField3 = new J




        // BACKGROUND IMGAGE
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Login();
    }
}

