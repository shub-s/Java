import java.sql.*;

class dbconnect{
    public static void main(String[] args) {
        try {
            // Register The Driver 
            Class.forName("com.mysql.jdbc.Driver");
            // Create Connection with Connection Object
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
            // Display Status of Connection When Connected
            System.out.println("Connected.");


            // Close the Connection
            conn.close();
            
        } catch (Exception e) {
            System.out.println(e.toString());
            // Display Error When erroe Occor while connecting
            System.out.println("Faile to Connect! Please check drivers and try again");
            // Close the Connection
            conn.close();
        }
    }
}