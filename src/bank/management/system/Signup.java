package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.Random;

public class Signup extends JFrame {
    JRadioButton r1,r2;
    JTextField textName,textFname;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);
    Signup(){         //
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,30,100,100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO :" + first);
        label1.setBounds(180,50,600,35);
        label1.setForeground(Color.orange);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,24));
        label2.setBounds(380,100,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,24));
        label3.setBounds(330,130,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway",Font.BOLD,20));
        labelName.setForeground(Color.white);
        labelName.setBounds(100,200,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,200,350,30);
        add(textName);

        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Raleway",Font.BOLD,20));
        labelfName.setForeground(Color.white);
        labelfName.setBounds(100,250,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,250,350,30);
        add(textFname);

        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setForeground(Color.white);
        gender.setBounds(100,300,200,30);
        add(gender);
        // Radio Buttons Gender

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(185,58,101));
        r1.setBounds(300,300,90,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(185,58,101));
        r2.setBounds(400,300,90,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setForeground(Color.white);
        DOB.setBounds(100,350,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,350,350,30);
        add(dateChooser);

        JLabel labelName5 = new JLabel("Email Address :");
        labelName5.setFont(new Font("Raleway",Font.BOLD,20));
        labelName5.setForeground(Color.white);
        labelName5.setBounds(100,400,200,30);
        add(labelName5);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,400,350,30);
        add(textFname);


        JLabel labelName6 = new JLabel("Marital Status :");
        labelName6.setFont(new Font("Raleway",Font.BOLD,20));
        labelName6.setForeground(Color.white);
        labelName6.setBounds(100,450,200,30);
        add(labelName6);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,450,350,30);
        add(textFname);


        JLabel labelName7 = new JLabel("Home Address :");
        labelName7.setFont(new Font("Raleway",Font.BOLD,20));
        labelName7.setForeground(Color.white);
        labelName7.setBounds(100,500,200,30);
        add(labelName7);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,500,350,30);
        add(textFname);


        JLabel labelName8 = new JLabel("City :");
        labelName8.setFont(new Font("Raleway",Font.BOLD,20));
        labelName8.setForeground(Color.white);
        labelName8.setBounds(100,550,200,30);
        add(labelName8);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,550,350,30);
        add(textFname);

        JLabel labelName9 = new JLabel("State :");
        labelName9.setFont(new Font("Raleway",Font.BOLD,20));
        labelName9.setForeground(Color.white);
        labelName9.setBounds(100,600,200,30);
        add(labelName9);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,600,350,30);
        add(textFname);

        JLabel labelName10 = new JLabel("Pin Code :");
        labelName10.setFont(new Font("Raleway",Font.BOLD,20));
        labelName10.setForeground(Color.white);
        labelName10.setBounds(100,650,200,30);
        add(labelName10);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD,14));
        textFname.setBounds(300,650,350,30);
        add(textFname);


        getContentPane().setBackground(new Color(185,58,101));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }
    public static void main(String[] args){
        new Signup();
    }
}
