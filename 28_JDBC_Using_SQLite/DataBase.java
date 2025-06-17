import java.sql.*;

public class DataBase
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");
            
        Statement st = con.createStatement();
            
        ResultSet rs = st.executeQuery("SELECT * FROM dept");
            
        int dno;
        String dname;
        while(rs.next())
        {
            dno = rs.getInt("deptno");
            dname = rs.getString("dname");
        
            System.out.println(dno+" "+dname);
        }
    }
}