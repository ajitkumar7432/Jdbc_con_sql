import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.io.*;

public class firstjdbc {
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/";
        String userName= "root";
        String password="Anupsingh54#";
        Connection con= DriverManager.getConnection(url,userName,password);
        Statement stm=con.createStatement();
        String query="create databse MyYard";
        boolean bl=stm.execute(query);
        System.out.println("Database created successfully"+bl);
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
}
