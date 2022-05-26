package com.example.demo;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class HelloServlet extends HttpServlet
{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
    {
        response.setContentType("Text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Welcome to register Servlet</h2>");






        String name=request.getParameter("user_name");
        String password=request.getParameter("user_password");
        String email=request.getParameter("user_email");
        String gender=request.getParameter("user_gender");
        String course=request.getParameter("user_course");
        String cond=request.getParameter("condition");


        System.out.println(name+" " + email+" "+gender+" "+course);

        boolean addedindb = false;

        try{
            Connection con = ConnectionP.createC();

            String query = "insert into ankittable(name,password,email,gender,course) values(?,?,?,?,?)";


            //preparing statement
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,password);
            ps.setString(3,email);
            ps.setString(4,gender);
            ps.setString(5,course);
            ps.executeUpdate();

            addedindb=true;

        }
        catch (Exception e){
            e.printStackTrace();
        }

        if(addedindb)
        {
            out.println("succesfully added");
        }
        else
        {
            out.println("something went wrong");
        }
        if(cond.equals("checked"))
        {
            out.println("<h2> Name :" +name + "<h2>");
            out.println("<h2> Password :" +password + "<h2>");
            out.println("<h2> Email :" +email + "<h2>");
            out.println("<h2> Gender:" +gender+ "<h2>");
            out.println("<h2> Course:" +course+ "<h2>");
        }
        else
        {
            out.println("<h2>you have not accept terms and condition</h2>");
        }
    }
}