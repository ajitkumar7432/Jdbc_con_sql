pakage com.jdbc.practice;
import java.sql.Connection;
import java.sql.Resultset;
import java.sql.Statement;
public class Selectjdbc {
    public static void main(String[] args){
    try{
        Connection con=ConnectionProvider.getConnection();
        String query="select * from table1";
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        while(set.next())
        {
            int id=set.getInt(1);
            String name=set.getString(2);
            String city=set.getString(3);
            System.out.println(name+":"+id+":"+city);
        }
        
        
        
    }catch(Exception e)
    {
        e.printStackTrace();
    }
}
}





