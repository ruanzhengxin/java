package FileUpdate;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        while(true){
            Socket s= ss.accept();
            new Thread(new ServeThread(s)).start();
        }
    }
}
