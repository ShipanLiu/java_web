package Basic8_Internet.test3_TCp.test3_exercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class receiver {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12345);
        Socket s = ss.accept();
        // 一次读一个 string read string but not the bytes
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line;
        while((line = reader.readLine()) != null) {
            System.out.println("接收到的数据: " + line);
        }
        ss.close();
    }
}
