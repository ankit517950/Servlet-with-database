package com.example.demo;
import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionP
{
    static Connection con;
    public static Connection createC()
    {
        try
        {
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");
            //Create Connection
            String user = "trainee";
            String password = "trainee#22";
            String url = "jdbc:mysql://192.168.1.137:3306/trainee22?allowPublicKeyRetrieval=true&autoReconnect=true&useSSL=false";
            con = DriverManager.getConnection(url,user,password);

            System.out.println("con "+con);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }

}
