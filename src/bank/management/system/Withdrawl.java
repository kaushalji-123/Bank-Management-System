package bank.management.system;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Time;


public class Withdrawl extends JFrame implements ActionListener {
    String pin;
    JButton withdrawB,backB;
    JTextField textField;
    Withdrawl(String pin){

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

        withdrawB = new JButton("WITHDRAW");
        withdrawB.setBounds(700,367,150,35);
        withdrawB.setForeground(Color.white);
        withdrawB.setBackground(new Color(48, 155, 0));
        withdrawB.setFont(new Font("Raleway",Font.BOLD,14));
        withdrawB.addActionListener(this);
        l3.add(withdrawB);

        backB = new JButton("BACK");
        backB.setBounds(700,408,150,35);
        backB.setForeground(Color.white);
        backB.setBackground(Color.BLACK);
        backB.setFont(new Font("Raleway",Font.BOLD,14));
        backB.addActionListener(this);
        l3.add(backB);

        setLayout(null);
        setSize(1500,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==withdrawB)
        try{
            String amount = textField.getText();
            Date date = new Date(0);
            if(textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter the amount you want withdrawl");
            }else{
                Conn c = new Conn();
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance = 0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                        }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"Rs."+amount+"Debited Successfully");
                setVisible(false);
                new main_Class(pin);
            }
        }catch(Exception E){
            E.printStackTrace();
        }
        else if (e.getSource()==backB) {
            setVisible(false);
            new main_Class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}
