import java.sql.*;

class db{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/jdbc";
        String uname = "root";
        String pass = "admin";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,uname,pass);
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println("Not Connected");
        }
    }
}