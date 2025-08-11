package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandalingResultSets {
	
		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			
			
			String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
			
			String username = "root";
			
			String password = "123456789";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			Connection con = DriverManager.getConnection(dbURL,username,password);
			
			
			Statement st = con.createStatement();
			
			
			String selectquery = "select * from persons;";
			
			 ResultSet rs1 = st.executeQuery(selectquery);

		        // Print header
		        System.out.printf("%-10s %-10s %-10s %-25s %-15s%n", "PersonID", "FirstName", "LastName", "Address", "City");
		        System.out.println("-------------------------------------------------------------------------------");

			
			while (rs1.next())
			{
				
			
				// Basics syntax for the result set
				
			/*	int id = rs.getInt("PersonID");
				System.out.println(id);
				
				// fetch FirstName
				
				String Firstname = rs.getString("FirstName");
				System.out.println(Firstname);
				
				//use can also use column indexing
				
				int id1 = rs.getInt(1);
				System.out.println(id1);
				
				String S = rs.getString(2);
				System.out.println(id1); */
				
				
				//print all the data // Execute query
		       
		        // Loop through result set
		       
		            int id11 = rs1.getInt("PersonID");
		            String firstName = rs1.getString("FirstName");
		            String lastName = rs1.getString("LastName");
		            String address = rs1.getString("Address");
		            String city = rs1.getString("City");

		            // Print data in formatted manner
		            System.out.printf("%-10d %-10s %-10s %-25s %-15s%n", id11, firstName, lastName, address, city);


		        // Close connection and statement
		       
			
			}
			
		}

	}



