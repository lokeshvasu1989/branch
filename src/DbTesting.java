import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTesting {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port ="3306";
Connection conn=    DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/dtf", "root", "loks1234");

Statement s= conn.createStatement();
 ResultSet rs=  s.executeQuery("SELECT * FROM  DER");
 while(rs.next())
 { 
System.out.println("Id :"+rs.getString("id"));
System.out.println("Name: "+rs.getString("name"));
System.out.println("Age: "+rs.getString("age"));
System.out.println("Address: "+rs.getString("address"));
System.out.println("  ");
	}
 }

}
