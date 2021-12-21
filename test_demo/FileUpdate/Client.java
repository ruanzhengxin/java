package FileUpdate;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("10.162.129.154",10000);
        BufferedReader br=new BufferedReader(new FileReader("D:\\java_code\\src\\PokerDemo\\Poker.java"));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();
        BufferedReader brServer=new BufferedReader(new InputStreamReader(s.getInputStream()));
        line=brServer.readLine();
        System.out.println(line);
        br.close();
        bw.close();
        brServer.close();
        }
    }

