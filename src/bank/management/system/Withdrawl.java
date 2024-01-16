package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Withdrawl extends JFrame implements ActionListener {
    String pin;
    JButton depositB,backB;
    JTextField textField;
    Withdrawl(){

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

        JLabel l4 = new JLabel("MAXIMUM WITHDRAWAL IS 10,000");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setForeground(Color.white);
        l4.setBounds(460,180,700,18);
        l3.add(l4);

        JLabel l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setFont(new Font("Raleway",Font.BOLD,16));
        l2.setForeground(Color.white);
        l2.setBounds(460,220,400,18);
        l3.add(l2);

        textField =new JTextField();
        textField.setBounds(460,265,320,30);
        textField.setBackground(new Color(43, 154, 166));
        textField.setForeground(Color.white);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        depositB = new JButton("DEPOSIT");
        depositB.setBounds(700,367,150,35);
        depositB.setForeground(Color.white);
        depositB.setBackground(new Color(48, 155, 0));
        depositB.setFont(new Font("Raleway",Font.BOLD,14));
//        depositB.addActionListener(this);
        l3.add(depositB);

        backB = new JButton("BACK");
        backB.setBounds(700,408,150,35);
        backB.setForeground(Color.white);
        backB.setBackground(Color.BLACK);
        backB.setFont(new Font("Raleway",Font.BOLD,14));
//        backB.addActionListener(this);
        l3.add(backB);

        setLayout(null);
        setSize(1500,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Withdrawl();
    }
}
