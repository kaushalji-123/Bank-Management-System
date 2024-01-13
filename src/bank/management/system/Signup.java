package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4,r5;

    JButton SignupButton=new JButton();
    JTextField textName,textFname,textEmail,textHome,textCity,textState,textPin;
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

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,400,350,30);
        add(textEmail);


        JLabel labelMarital = new JLabel("Marital Status :");
        labelMarital.setFont(new Font("Raleway",Font.BOLD,20));
        labelMarital.setForeground(Color.white);
        labelMarital.setBounds(100,450,200,30);
        add(labelMarital);

        r3 = new JRadioButton("Single");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(185,58,101));
        r3.setBounds(300,450,90,30);
        add(r3);

        r4 = new JRadioButton("Married");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(185,58,101));
        r4.setBounds(400,450,90,30);
        add(r4);

        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway",Font.BOLD,14));
        r5.setBackground(new Color(185,58,101));
        r5.setBounds(500,450,90,30);
        add(r5);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);
        buttonGroup1.add(r5);


        JLabel labelHome = new JLabel("Home Address :");
        labelHome.setFont(new Font("Raleway",Font.BOLD,20));
        labelHome.setForeground(Color.white);
        labelHome.setBounds(100,500,200,30);
        add(labelHome);

        textHome = new JTextField();
        textHome.setFont(new Font("Raleway",Font.BOLD,14));
        textHome.setBounds(300,500,350,30);
        add(textHome);


        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway",Font.BOLD,20));
        labelCity.setForeground(Color.white);
        labelCity.setBounds(100,550,200,30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,550,350,30);
        add(textCity);

        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Raleway",Font.BOLD,20));
        labelState.setForeground(Color.white);
        labelState.setBounds(100,600,200,30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,600,350,30);
        add(textState);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway",Font.BOLD,20));
        labelPin.setForeground(Color.white);
        labelPin.setBounds(100,650,200,30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,650,350,30);
        add(textPin);

        SignupButton = new JButton("SIGN UP");
        SignupButton.setFont(new Font("Arial", Font.BOLD, 12));
        SignupButton.setForeground(Color.white);
        SignupButton.setBackground(Color.black);
        SignupButton.setBounds(549,700,100,30);
        SignupButton.addActionListener(this);
        add(SignupButton);


        getContentPane().setBackground(new Color(185,58,101));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(r3.isSelected()){
            marital = "Single";
        } else if (r4.isSelected()) {
            marital = "Married";
        }else if (r5.isSelected()) {
            marital = "Other";
        }
        String address = textHome.getText();
        String city = textCity.getText();
        String state = textState.getText();
        String pinCode = textPin.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null ,"Fill all the fields");
            }else {
                Conn conn1 = new Conn();
                String q = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + state + "','" + pinCode + "')";
                conn1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Signup();
    }
}
