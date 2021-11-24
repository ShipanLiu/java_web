package Basic8_Internet.test2_UDP;

import java.io.IOException;
import java.net.*;

public class Test1_UDP_Send {
    public static void main(String[] args) throws IOException {
        // create UDP Socket
        DatagramSocket udpSocket = new DatagramSocket();

        // create an data package
        byte[] dataArr = "hello, jiba".getBytes();
        DatagramPacket updPackage = new DatagramPacket(dataArr, dataArr.length, InetAddress.getByName("shipan"), 10086);
        // send
        udpSocket.send(updPackage);
        // close the socket
        udpSocket.close();
    }
}
