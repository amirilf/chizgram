package app.server.config.DataBase;

import app.server.models.User;

public class sqlCommands {
    sqlConnection Connection = new sqlConnection();
    public Boolean addUser(){
        String command;
        return true;
    }

    public Boolean login(String userName,String password) throws Exception {
        String command = String.format("SELECT * FROM USER WHERE userName='%s' & password='%s'",
                userName,password);
        String resultSet = Connection.ExecuteQuery(command).toString();
        if(resultSet!=null) return true;
        return false;
    }

    public Boolean Register(User user) throws Exception {
        String command = String.format("INSERT INTO USER (userName,password,name,phoneNumber) VALUES('%s','%s','%s','%s')",
                user.getUserName(),user.getPassword(),user.getName(),user.getPhoneNumber());
        Boolean result = Connection.ExecuteSql(command);
        return result;
    }

    public Boolean saveMessage(){
        String command = String.format("");
        return true;
    }

}
