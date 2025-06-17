import java.sql.*;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class Database2 
{    
    public static void main(String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");  
        
        Connection con = DriverManager.getConnection("jdbc:sqlite:c://sqlite//univ.db");

        PreparedStatement stm = con.prepareStatement("SELECT * FROM students WHERE deptno = ?");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department No : ");
        int dno = sc.nextInt();

        stm.setInt(1,dno);

        ResultSet rs = stm.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getInt("roll")+" "+rs.getString("name")+" "+rs.getInt("deptno"));
        }

        con.close();
        rs.close();
        stm.close();
    }
}
