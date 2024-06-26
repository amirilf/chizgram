package app.server.View;

import app.server.config.DataBase.sqlCommands;
import app.server.models.User;
import lombok.SneakyThrows;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.*;
import java.net.Socket;

public class commandMethods extends Thread {
    sqlCommands sqlCommand = new sqlCommands();

    public void login(Socket socket, String userName, String password) throws Exception {
        Boolean bool = sqlCommand.login(userName,password);
        if(bool) {

            Thread thread = new Thread(new handleMessages(socket));

        }
    }

    public void Register(Socket socket,User user) throws Exception {
        Boolean bool = sqlCommand.Register(user);
        if(bool) {

            Thread thread = new Thread(new handleMessages(socket));

        }

    }


}

class handleMessages implements Runnable{
    protected Socket socket;
    protected DataInputStream dis = new DataInputStream(socket.getInputStream());
    protected DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

    public handleMessages(Socket socket) throws IOException {
        this.socket = socket;
    }

    @SneakyThrows
    @Override
    public void run() {
        String input;
        while(true){
            input = dis.readUTF();
            //// switch case

        }
    }

    public void sendMessage(){

    }
}
