package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;
    JTextField textField2;

    JButton button1,button2,button3;
    JPasswordField PasswordField3;

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



        label1 = new JLabel("WELCOME TO HM BANK ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGrade",Font.BOLD,28));
        label1.setBounds(250,125,450,40);
        add(label1);

        label2 = new JLabel("Card No. :");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,18));
        label2.setBounds(190,190,250,30);
        add(label2);
            // input label of card
        textField2 = new JTextField(10);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("Pin No.   :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,18));
        label3.setBounds(190,250,250,30);
        add(label3);
         // input label of password

        PasswordField3 = new JPasswordField(15);
        PasswordField3.setBounds(325,250,230, 30);
        PasswordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(PasswordField3);

        // Button

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 12));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(338,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 12));
        button2.setForeground(Color.white);
        button2.setBackground(Color.red);
        button2.setBounds(442,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD, 12));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(320,350,240,30);
        button3.addActionListener(this);
        add(button3);


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

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){

            }else if(e.getSource() == button2){
                textField2.setText("");
                PasswordField3.setText("");
            }else if(e.getSource() == button3) {

            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}

