import java.sql.*;

public class DDLStatementDemo 
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement st = con.createStatement();

        //st.executeUpdate("CREATE TABLE Temp(a integer,b text)");
        st.executeUpdate("DROP TABLE Temp");

        st.close();
        con.close();
    }    
}
