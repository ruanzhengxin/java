package FileUpdate;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10000);
        Socket s=ss.accept();
        BufferedWriter bw=new BufferedWriter(new FileWriter("cpoy.java"));
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        BufferedWriter bwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("finish");
        bwServer.flush();
        bw.close();
        br.close();
        bwServer.close();
    }
}
