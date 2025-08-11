package Java_labs_26_07;
import java.sql.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "123456789";
        Connection con = null;
        Statement stmt = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create database
            con = DriverManager.getConnection(url, username, password);
            stmt = con.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS companydb");
            System.out.println("Database created or already exists.");

            //  Use database and create table
            stmt.execute("USE companydb");
            String createTable = "CREATE TABLE IF NOT EXISTS employees (" +
                                 "id INT PRIMARY KEY, " +
                                 "name VARCHAR(50), " +
                                 "department VARCHAR(50), " +
                                 "salary DOUBLE)";
            stmt.executeUpdate(createTable);
            System.out.println("Table created.");

            // Insert records
            String insertSQL = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertSQL);
           
            ps.setInt(1, 101); ps.setString(2, "Alice"); ps.setString(3,"HR"); ps.setDouble(4, 50000);
            ps.executeUpdate();
            ps.setInt(1, 102); ps.setString(2, "Bob"); ps.setString(3,"IT"); ps.setDouble(4, 65000);
            ps.executeUpdate();
            ps.setInt(1, 103); ps.setString(2, "Charlie"); ps.setString(3,"Sales"); ps.setDouble(4, 60000);
            ps.executeUpdate();

            System.out.println("Data inserted.");
            System.out.println("\nAll employees:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            while(rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("department") + ", " + rs.getDouble("salary"));
            }

            //  SELECT WHERE id=102
            System.out.println("\nEmployee with id=102:");
            rs = stmt.executeQuery("SELECT * FROM employees WHERE id = 102");
            while(rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("department") + ", " + rs.getDouble("salary"));
            }

            //  SELECT WHERE department='IT'
            System.out.println("\nEmployees in IT department:");
            rs = stmt.executeQuery("SELECT * FROM employees WHERE department = 'IT'");
            while(rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("department") + ", " + rs.getDouble("salary"));
            }

            //  UPDATE salary
            stmt.executeUpdate("UPDATE employees SET salary = 70000 WHERE id = 102");
            System.out.println("\nUpdated salary of id=102.");

            // UPDATE department
            stmt.executeUpdate("UPDATE employees SET department = 'Finance' WHERE name = 'Alice'");
            System.out.println("Updated department of Alice.");

            //  DELETE id=103
            stmt.executeUpdate("DELETE FROM employees WHERE id = 103");
            System.out.println("Deleted employee with id=103.");

            //  DELETE department = 'Sales' 
            stmt.executeUpdate("DELETE FROM employees WHERE department = 'Sales'");
            System.out.println("Deleted employees in Sales department.");

            //  to show current data
            System.out.println("\nFinal employees table:");
            rs = stmt.executeQuery("SELECT * FROM employees");
            while(rs.next()) {
                System.out.println(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("department") + ", " + rs.getDouble("salary"));
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
