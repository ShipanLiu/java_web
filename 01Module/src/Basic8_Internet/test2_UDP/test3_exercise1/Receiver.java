/*
*
* receive: dead loop for receive
*
* */

package Basic8_Internet.test2_UDP.test3_exercise1;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receiver {
    public static void main(String[] args) throws IOException {
        // create udp socket
        DatagramSocket socket = new DatagramSocket(12345);
        // receive data in a dead loop
        while(true) {
            byte[] datas = new byte[1024];
            DatagramPacket packet = new DatagramPacket(datas, datas.length);
            socket.receive(packet);

            //parse the data and sout
            // packet.getLength() 目的： 就是1024 个位置 后面的空白步接受。
            System.out.println("接受的数据： " + new String(packet.getData(), 0, packet.getLength()));
        }

    }
}
