import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbs {

	public static void main(String[] args) throws SQLException {
		String host = "localhost";
		String port = "3306";
        Connection cn= DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/dtf","root","loks1234");
        Statement sr=  cn.createStatement();
        ResultSet rs= sr.executeQuery("select * from der where age= '29' ");
        while(rs.next())
       {
	  System.out.println("Id: "+rs.getString("id"));
	  System.out.println("Name: "+rs.getString("name"));
	  System.out.println("Age: "+rs.getString("age"));
      System.out.println("Address: "+rs.getString("address"));
       }
	   }
       }
