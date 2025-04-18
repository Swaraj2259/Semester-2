import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/LMS";
        String user = "root";
        String password = "Swaraj1725";
        String ins = "INSERT INTO Books (bookid, bookname,price) VALUES (?, ?, ?)";
        String fetch = "SELECT * FROM Books";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection(url, user, password);
            if (cn!=null){
                System.out.println("Connection Established");
                PreparedStatement ps = cn.prepareStatement(ins);
                ps.setInt(1, 1);
                ps.setString(2, "yash");
                ps.setInt(3, 100);
                int i = ps.executeUpdate();
                if (i>0){
                    System.out.println("Record Inserted");
                }
                else{
                    System.out.println("Record Not Inserted");
                }
                PreparedStatement ps2=cn.prepareStatement(fetch);
                ResultSet rs=ps2.executeQuery();

                while(rs.next()){
                    int bookid=rs.getInt("bookid");
                    String bookname=rs.getString("bookname");
                    int price=rs.getInt("price");
                    System.out.println("Book ID: "+bookid+" Book Name: "+bookname+" Price: "+price);
                }

            }
            else{
                System.out.println("Connection Failed");
            }
        }
        catch(Exception e){
            System.out.println("error"+e);
            
        }
    }

}
