package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Deposit extends JFrame {
    String pin;
    JTextField textField = new JTextField();
    Deposit(String pin){
        super("Deposite here");
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image = new JLabel(ii3);
        image.setBounds(215,30,100,100);
        l3.add(image);

        JLabel l4 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setForeground(Color.white);
        l4.setBounds(460,180,400,18);
        l3.add(l4);

        textField =new JTextField();
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);


        JLabel label1 = new JLabel("HM Bank");
        label1.setBounds(380,480,400,30);
        label1.setFont(new Font("Raleway",Font.BOLD,25));
        label1.setForeground(new Color(43, 154, 166));
        l3.add(label1);
        JLabel label2 = new JLabel("HM Bank");
        label2.setBounds(770,480,400,30);
        label2.setFont(new Font("Raleway",Font.BOLD,25));
        label2.setForeground(new Color(43, 154, 166));
        l3.add(label2);

        JLabel l5 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setForeground(Color.white);
        l5.setBounds(460,180,400,18);
        l3.add(l5);



        JLabel l6 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setForeground(Color.white);
        l6.setBounds(460,180,400,18);
        l3.add(l6);

        JLabel l7 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setForeground(Color.white);
        l7.setBounds(460,180,400,18);
        l3.add(l7);

        JLabel l8 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setForeground(Color.white);
        l8.setBounds(460,180,400,18);
        l3.add(l8);

        JLabel l9 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setForeground(Color.white);
        l9.setBounds(460,180,400,18);
        l3.add(l9);

        JLabel l10 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setForeground(Color.white);
        l10.setBounds(460,180,400,18);
        l3.add(l10);



        setLayout(null);
        setSize(1500,1080);
        setLocation(0,0);
        setVisible(true);

    }
    public static void main(String[] argd){
            new Deposit("");
    }
}
