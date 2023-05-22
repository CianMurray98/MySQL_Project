package ie.atu;
import java.sql.*;

public class testConnection {

    public static void main(String[] args) {

        Connection connection = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");      // Load the driver class

            // Create a connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/motorcycles", "root", "password");
            System.out.println("Connection made to connection pool");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally
        {
            // Close the connection when finished
            if (connection != null) {
                try
                {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}