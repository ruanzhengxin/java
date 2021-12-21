package UDP;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SendSocket {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        while (true) {
            DatagramSocket ds = new DatagramSocket();
            String input = new String();
            System.out.println("input:");
            input=sc.nextLine();
            byte[] data=input.getBytes(StandardCharsets.UTF_8);
            int len=data.length;
            InetAddress address=InetAddress.getByName("10.162.129.154");
            int port=10086;
            DatagramPacket dp=new DatagramPacket(data,len,address,port);
            ds.send(dp);
            ds.close();
        }

    }
}
