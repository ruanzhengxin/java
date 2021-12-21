package FileUpdate;

import java.io.*;
import java.net.Socket;

public class ServeThread implements Runnable {
    private Socket s;
    public ServeThread(Socket s) {
        this.s=s;
    }

    @Override
    public void run() {
        try {
            BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));

            int count=0;
            File file=new File("copy"+count+".java");
            while(file.exists()){
                count++;
                file=new File("copy"+count+".java");
            }
            BufferedWriter bw=new BufferedWriter(new FileWriter(file));
            String line;
            while((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            BufferedWriter bwServer=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bwServer.write("finish");
            bwServer.flush();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
