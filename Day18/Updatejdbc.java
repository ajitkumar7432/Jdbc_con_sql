import java.sql.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class Updatejdbc {
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/hello";
        String username= "root";
        String password="root";
        Connection con= DriverManager.getConnection(url,username,password);
        String q = "update tabl1 set tName=? , tCity=?";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name:");
        String name=br.readLine();
        System.out.println("Enter theb city name :");
        String city=br.readLine();
        System.out.println("Ente the student id:");
        int id = Integer.parseInt(br.readLine());
        PreparedStatement pstmt=con.prepareStatement(q);
        pstmt.setString(1,name);
        pstmt.setString(2,city);
        pstmt.setInt(3,id);
        pstmt.executeUpdate();
        
        
        con.close();
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
}




