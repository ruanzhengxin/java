package CopyTest;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("D:\\java_code\\src\\PokerDemo\\Poker.java"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("copy.java"));
        char[] chs=new char[1024];
        int len=0;
        while((len=br.read(chs))!=-1){
            bw.write(chs,0,len);
        }
        br.close();
        bw.close();
    }
}
