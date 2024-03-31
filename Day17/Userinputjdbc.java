import java.sql.*;
import java.io.*;
public class Userinputjdbc {
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/hello";
        String username= "root";
        String password="root";
        Connection con= DriverManager.getConnection(url,username,password);
        String q =("insert into table1(tNAme,tCity) values(?,?) ");

        PreparedStatement pstmt=con.prepareStatement(q);  
        BufferedReader br=new BufferReader(new InputStreamReader(System.in));
        System.out.println("Enter the name:");
        String name=br.readLine();
        System.out.println("Enter the city:");
        String city=br.readLine();
        pstmt.setString(1,name);
        pstmt.setString(2,city);
        pstmt.executeUpdate();
        System.out.println("Data inserted successfully!");
        con.close();
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
