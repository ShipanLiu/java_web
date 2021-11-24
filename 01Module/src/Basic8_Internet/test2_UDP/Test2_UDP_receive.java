package Basic8_Internet.test2_UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Test2_UDP_receive {
    public static void main(String[] args) throws IOException {
        // create receive Socket(use another constructor fome DatagramSocket)
        DatagramSocket receiveSocket = new DatagramSocket(10086);
        // create package to receive data
        byte[] receiveArr = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveArr, receiveArr.length);
        // socket start to receive
        receiveSocket.receive(receivePacket);

        // package.getData()
        // 容器是 1024， 实际上用不了 1024个长度,  拿到整个1024 长度的数据缓冲区
        byte[] receivedData = receivePacket.getData();
        // 拿到实际数据的长度
        int len = receivePacket.getLength();
        String dataStr = new String(receivedData, 0, len);
        System.out.println(dataStr);

        receiveSocket.close();
    }
}
