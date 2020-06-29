import java.sql.*;
import java.time.LocalTime;

class dbconnect{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String uname = "root";
        String pass = "admin";
        try {
            // Register and Load The Driver 
            Class.forName("com.mysql.jdbc.Driver");
            // Create Connection with Connection Object
            Connection conn = DriverManager.getConnection(url,uname,pass);
            // Display Status of Connection When Connected
            LocalTime tim = LocalTime.now();
            System.out.println(tim.toString());
            System.out.println("Connecting to database....");
            
            System.out.println("Connected.");
            
            System.out.println("Fetching data...");
            
            System.out.println("_______________________________________");
            // Create Statement
            Statement st = conn.createStatement();
            // Execute Query
            ResultSet rs = st.executeQuery("select * from demo");
            while(rs.next()){
                // Store and print the value in String
                String name = rs.getString("name");
                String id = rs.getString("num");
                System.out.println(id+" Name from the Database is : "+name);                
                              
            }  
            System.out.println("Closing Connection..."); 
           
            System.out.println("Connection Closed.");
            LocalTime tim2 = LocalTime.now();
            System.out.println(tim2.toString());         
            
            // Close the Connection
            st.close();
            conn.close();
            
            
        } catch (Exception e) {
            System.out.println(e.toString());
            // Display Error When erroe Occor while connecting
            System.out.println("Faile to Connect! Please check drivers and try again");
            // Close the Connection            
        }
        
    }
}