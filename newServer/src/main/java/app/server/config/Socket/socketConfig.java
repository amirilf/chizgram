package app.server.config.Socket;

import app.server.View.commandMethods;
import app.server.models.User;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class socketConfig {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(1384);
        List<User> users= new ArrayList<>();

        while(true){
            commandMethods Methods = new commandMethods();
            String command;
            Socket socket = serverSocket.accept();
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            command = dis.readUTF();
            if (command.equals("Login")){
                String userName = dis.readUTF();
                String password = dis.readUTF();
                Methods.login(socket,userName,password);
                //todo
            }
            else if (command.equals("Register")){
                String userName = dis.readUTF();
                String password = dis.readUTF();
                String name = dis.readUTF();
                String phoneNumber = dis.readUTF();
                User user = new User(userName,password,name,phoneNumber);
                Methods.Register(socket,user);
                //todo
            }
        }
    }
}
