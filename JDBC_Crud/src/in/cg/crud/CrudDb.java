package in.cg.crud;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CrudDb {

	public static void main(String[] args)
	{
		String dbURL="jdbc:mysql://127.0.0.1:3306/m18";
        String username="root";
        String password="Sonalshinde@09";
        try
        {
           Connection con=DriverManager.getConnection(dbURL, username, password);
           String sql="INSERT INTO Employee22(username,password,email)values(?,?,?)";
           PreparedStatement s=con.prepareStatement(sql);
           
           s.setString(1, "Sonal Shinde 9");
           s.setString(2, "Pass@123");
           s.setString(3, "sonal@gmail.com");
           
           int rows=s.executeUpdate();
           
           if(rows>0)
           {
        	   System.out.println("A new user information entered successfully");
           }
           con.close();
        }
        catch(SQLException e)
        {
        	System.out.println("Exception occoured "+e);
        	
        }
	}
}
