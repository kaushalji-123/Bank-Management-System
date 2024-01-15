package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    main_Class(String pin){
        this.pin= pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label = new JLabel("Please select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.white);
        label.setFont(new Font("System",Font.BOLD,28));
        l3.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(410,271,150,35);
        b1.setForeground(Color.white);
        b1.setBackground(new Color(0,66,37));
        b1.setFont(new Font("Raleway",Font.BOLD,14));
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("FAST CASH");
        b2.setBounds(410,320,150,35);
        b2.setForeground(Color.white);
        b2.setBackground(new Color(0,66,37));
        b2.setFont(new Font("Raleway",Font.BOLD,14));
        b2.addActionListener(this);
        l3.add(b2);

        b3 = new JButton("PIN CHANGE");
        b3.setBounds(410,365,150,35);
        b3.setForeground(Color.white);
        b3.setBackground(new Color(0,66,37));
        b3.setFont(new Font("Raleway",Font.BOLD,14));
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("EXIT");
        b4.setBounds(410,412,150,35);
        b4.setForeground(Color.white);
        b4.setBackground(new Color(180, 0, 0));
        b4.setFont(new Font("Raleway",Font.BOLD,14));
        b4.addActionListener(this);
        l3.add(b4);

        b5 = new JButton("CASH WITHDRAWL");
        b5.setBounds(700,274,150,35);
        b5.setForeground(Color.white);
        b5.setBackground(new Color(0,66,37));
        b5.setFont(new Font("Raleway",Font.BOLD,12));
        b5.addActionListener(this);
        l3.add(b5);

        b6 = new JButton("MINI STATEMENT");
        b6.setBounds(700,320,150,35);
        b6.setForeground(Color.white);
        b6.setBackground(new Color(0,66,37));
        b6.setFont(new Font("Raleway",Font.BOLD,12));
        b6.addActionListener(this);
        l3.add(b6);

        b7 = new JButton("BALANCE INQUIRY");
        b7.setBounds(700,364,150,35);
        b7.setForeground(Color.white);
        b7.setBackground(new Color(0,66,37));
        b7.setFont(new Font("Raleway",Font.BOLD,12));
        b7.addActionListener(this);
        l3.add(b7);



            setSize(1550,1080);
            setLocation(0,0);
            setLayout(null);
            setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            System.exit(0);
        }
    }

    public static void main(String[] args){
        new main_Class("");
    }
}
