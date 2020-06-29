import java.sql.*;
import java.util.*;

class jdbc{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
            System.out.println("Connected");
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.println("Failed to connect");
        }
        
    }
}