package crud.data;

import java.sql.*;

//database connection cleanup 
public class DBUtil
{
    public static void closeStatement(Statement s)
    {
        try 
        {
            if (s != null) 
            {
                s.close();
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }

    public static void closePreparedStatement(Statement ps)
    {
        try 
        {
            //if statement is open then close it 
            if (ps != null)
            {
                ps.close();
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }

    public static void closeResultSet(ResultSet rs)
    {
        try
        {
            if (rs != null) 
            {
                rs.close();
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
    }
}