import java.util.*;
import java.sql.*;

public class StatementDemo 
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        PreparedStatement pst = con.prepareStatement("INSERT INTO dept VALUES (?,?)");

        int dno = 80;
        String dn = "HR";

        pst.setInt(1, dno);
        pst.setString(2, dn);

        pst.executeUpdate();

        Statement st = con.createStatement();
        //st.executeUpdate("DELETE FROM dept WHERE deptno=60");
        //st.executeUpdate("INSERT INTO dept VALUES(70,'AERO')");
        //st.executeUpdate("UPDATE dept SET dname='IT' WHERE deptno=10");

        st.close();
        pst.close();
        con.close();
    }    
}
