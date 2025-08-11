package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		
		String username = "root";
		
		String password = "123456789";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		Connection con = DriverManager.getConnection(dbURL,username,password);
		
		
		Statement st = con.createStatement();
		
		
		String selectquery = "select * from persons;";
		
		ResultSet rs = st.executeQuery(selectquery);
		
		while (rs.next())
		{
			System.out.println(rs.getString("PersonID"));
			System.out.println(rs.getString("FirstName"));
			System.out.println(rs.getString("LastName"));
			
		
			// Basics syntax for the result set
			
			int id = rs.getInt("PePersonID");
			System.out.println(id);
			
			// fetch FirstName
			
			String Firstname = rs.getString("FirstName");
			System.out.println(Firstname);
		
		}
		
	}

}
