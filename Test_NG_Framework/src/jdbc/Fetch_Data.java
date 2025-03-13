package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetch_Data 
{
public static void main(String[] args) throws SQLException {
	String url = "jdbc:mysql://localhost:3306/Owner";
	String usn = "root";
	String pwd = "root";
	  Connection connect = DriverManager.getConnection(url, usn, pwd);//building the connection btwn the script & give access to data base
	Statement statment = connect.createStatement();//open the data base interface 
	ResultSet query = statment.executeQuery("select * from Users");//executing the query
	query.next();
	
	String stmt1 = query.getString("number");
	System.out.println(stmt1);
	connect.close();// to close the connection
	}
}

