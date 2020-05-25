import java.sql.*;

class jdbc_insert{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String uname = "root";
        String pass = "admin";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url,uname,pass);
            System.out.println("Connected");

            Statement st = conn.createStatement();
            int count = st.executeUpdate("insert into demo values(8,'Demo')");
            System.out.println(count+" row/s affected.");
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Failed to connect.");
        }
    }
}