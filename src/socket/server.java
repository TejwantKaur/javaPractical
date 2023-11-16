package socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket obj = new ServerSocket(12012);
        System.out.println("Server Started... Waiting for Connection...");

        Socket s = obj.accept();
        System.out.println("Client Connected...");

        DataInputStream instr = new DataInputStream(s.getInputStream());
        String str = (String) instr.readUTF();
        System.out.println("Message recieved.. " + str);

        obj.close();
    }
}
