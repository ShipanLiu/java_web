/*
 * send:   data form keyboard and end when 886 input(知道输入886 程序才停止发送)
 *
 * */
package Basic8_Internet.test2_UDP.test3_exercise1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Sender {
    public static void main(String[] args) throws IOException {
        // 创建 udp 对象
        DatagramSocket socket = new DatagramSocket();
        // 自己封装 键盘录入数据
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        String line;
        while((line = reader.readLine()) != null) {
            // if the input is 886, break
            if("886".equals(line)) {
                break;
            }

            // standert send data
            byte[] bytes = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("shipan"), 12345);
            socket.send(dp);
        }

        socket.close();
        }
    }
