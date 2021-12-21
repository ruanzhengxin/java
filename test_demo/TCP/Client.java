package TCP;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.162.129.154", 10000);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        String line;

        while((line=br.readLine())!=null){
            if(line.equals("886"))break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
    }
}
