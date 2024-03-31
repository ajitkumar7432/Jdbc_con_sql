import java.sql.*;
import java.io.*;
public class Largeimage {
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/hello";
        String username= "root";
        String password="root";
        Connection con= DriverManager.getConnection(url,username,password);
        String q =("insert into images(pic) values(?) ");

        PreparedStatement pstmt=con.prepareStatement(q); 
        JFileChooser jfc=JFileChooser();
        jfc.showOpenDialog(null) ;
        File file=jfc.getSelectedFile();
        FileInputStream fis=new FileInputStream(file);
        
        pstmt.setBinaryStream(1,fis,fis.available());
        
        pstmt.executeUpdate();
        JOptionPane.showMessageDialog(null,"Success");
        System.out.println("Image inserted successfully!");
        con.close();
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
}



