package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ReceiveSocket {
    public static void main(String[] args) throws IOException {

        while (true) {
            DatagramSocket ds = new DatagramSocket(10086);
            byte[] bys = new byte[1024];
            DatagramPacket dp=new DatagramPacket(bys,bys.length);
            ds.receive(dp);
            byte[] datas=dp.getData();
            System.out.println(new String(datas,0,dp.getLength()));
            ds.close();
        }

    }
}
