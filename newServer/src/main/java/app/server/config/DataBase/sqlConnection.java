package app.server.config.DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlConnection {

    public Boolean ExecuteSql(String sqlCommand) throws Exception  {
        String URL = "jdbc:mysql://localhost/chatdb";
        String User = "universityUser";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,User,password);
            Statement statement = con.prepareStatement(sqlCommand);
            statement.execute(sqlCommand);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public ResultSet ExecuteQuery(String sqlCommand) throws Exception  {
        String URL = "jdbc:mysql://localhost/universitydb";
        String User = "universityUser";
        String password = "1234";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL,User,password);
            Statement statement = con.prepareStatement(sqlCommand);
            ResultSet res = statement.executeQuery(sqlCommand);
            return res;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

}

