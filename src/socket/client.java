package socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost",12012);

        DataOutputStream obj2 = new DataOutputStream(s.getOutputStream());
        obj2.writeUTF("Hello... :)");
        obj2.flush();
        obj2.close();
        s.close();

    }
}
