package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JButton depositB,backB;
    JTextField textField;
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
        textField.setBounds(460,230,320,30);
        textField.setBackground(new Color(43, 154, 166));
        textField.setForeground(Color.white);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        depositB = new JButton("DEPOSIT");
        depositB.setBounds(700,367,150,35);
        depositB.setForeground(Color.white);
        depositB.setBackground(new Color(48, 155, 0));
        depositB.setFont(new Font("Raleway",Font.BOLD,14));
        depositB.addActionListener(this);
        l3.add(depositB);

        backB = new JButton("BACK");
        backB.setBounds(700,408,150,35);
        backB.setForeground(Color.white);
        backB.setBackground(Color.BLACK);
        backB.setFont(new Font("Raleway",Font.BOLD,14));
        backB.addActionListener(this);
        l3.add(backB);

        JLabel label1 = new JLabel("HM Bank");
        label1.setBounds(380,480,400,30);
        label1.setFont(new Font("Raleway",Font.BOLD,25));
        label1.setForeground(new Color(140, 27, 71));
        l3.add(label1);
        JLabel label2 = new JLabel("HM Bank");
        label2.setBounds(770,480,400,30);
        label2.setFont(new Font("Raleway",Font.BOLD,25));
        label2.setForeground(new Color(140, 27, 71));
        l3.add(label2);

        setLayout(null);
        setSize(1500,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        String amount = textField.getText();
        Date date = new Date();

            if(e.getSource()==depositB) {
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter The Amount You want to Deposit");
                }else {
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into bank values('" + pin + "','" + date +"','Deposit','" + amount + "')");
                    JOptionPane.showMessageDialog(null,"RS. " +amount+ " Deposit Successfull");
                    setVisible(false);
                }
            } else if (e.getSource()==backB) {
                setVisible(false);
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] argd){
            new Deposit("");
    }
}
