package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement; // Import the correct interface

public class PreparedStatementDemo {
	/*public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
		String username = "root";
		String password = "123456789";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(dbURL, username, password);

		String query = "SELECT * FROM Persons WHERE FirstName = ?";
		PreparedStatement ps = con.prepareStatement(query); // No need to cast

		ps.setString(1, "Amit");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString("FirstName"));
			System.out.println(rs.getString("LastName"));
		}
		con.close();
	}*/
	
		/*public static void main(String[] args) throws SQLException, ClassNotFoundException {
			String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
			String username="root";
			String password="123456789";

			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection(dbURL, username, password);

			String query1 = "SELECT * FROM persons WHERE FirstName = 'Ravi'and PersonID='3'";
			String query2 = "SELECT * FROM persons WHERE FirstName = ? and PersonID = ?";
			PreparedStatement ps = con.prepareStatement(query2); // No need to cast

			ps.setString(1,"Ravi");
			ps.setInt(2,3);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println(rs.getString("Address"));
				System.out.println(rs.getString("LastName"));
				System.out.println(rs.getString("City"));
			}
		}*/
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
	        String dbURL = "jdbc:mysql://localhost:3306/2607wiprodb";
	        String username = "root";
	        String password = "123456789";
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection con = DriverManager.getConnection(dbURL, username, password);
	        String insertQuery = "INSERT INTO persons (PersonID, FirstName, LastName, Address, City) VALUES (?, ?, ?, ?, ?)";
	        PreparedStatement ps = con.prepareStatement(insertQuery);
	        ps.setInt(1, 5);                  
	        ps.setString(2, "Alice");     
	        ps.setString(3, "Arora");            
	        ps.setString(4, "305 Church Street");          
	        ps.setString(5, "Kolkata");                   
	        int rowsAffected = ps.executeUpdate();
	        System.out.println("Rows inserted: " + rowsAffected);
	    }
	}
	
	
	
	




