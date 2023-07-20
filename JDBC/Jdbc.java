package JDBC;

import java.sql.*;

public class Jdbc
{
    public static void main(String[] args)
    {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
              
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/test","root","");  
              
            Statement stmt=con.createStatement();  
            /*
            stmt.executeUpdate("insert into students(id, name) values(1,'ABC');");
            stmt.executeUpdate("insert into students(id, name) values(2,'JIK');");
            stmt.executeUpdate("insert into students(id, name) values(3,'PLO');");
            stmt.executeUpdate("insert into students(id, name) values(4,'RIT');");
            stmt.executeUpdate("insert into students(id, name) values(5,'VIH');");
            */

            ResultSet R = stmt.executeQuery("select * from students");
            while(R.next())
            {
                System.out.println(R.getInt(1)+"  "+R.getString(2));
            }
            System.out.println("Inserted Successfully");

            con.close();  
              
            }catch(Exception e){ System.out.println(e);}  
              
            
    }
}