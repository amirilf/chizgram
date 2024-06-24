package app.server.config.Socket;

import app.server.View.commandMethods;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class socketConfig {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1384);

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
                Methods.login(userName,password);
                //todo
            }
            else if (command.equals("Register")){
                String userName = dis.readUTF();
                String password = dis.readUTF();
                String name = dis.readUTF();
                String phoneNumber = dis.readUTF();
                //todo
            }
        }
    }
}
