import java.sql.*;
public class Insertdata {
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/hello";
        String username= "root";
        String password="root";
        Connection con= DriverManager.getConnection(url,username,password);
        String q =("insert into table1(tNAme,tCity) values(?,?) "); 
        PreparedStatement pstmt=con.prepareStatement(q);  
        pstmt.setString(1,"Ajitkumar");
        pstmt.setString(2,"Mumbai");
        pstmt.executeUpdate();
        System.out.println("Data inserted successfully!");
        con.close();
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
