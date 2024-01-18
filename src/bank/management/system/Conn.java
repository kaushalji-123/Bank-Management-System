package bank.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;
    public Conn(){
        // Exception handdleing for run time error
        try{
            connection = DriverManager.getConnection( "jdbc:mysql://localhost:3306/HMBank ","root","Forgate@123");
            statement = connection.createStatement();
            System.out.println("connected");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

