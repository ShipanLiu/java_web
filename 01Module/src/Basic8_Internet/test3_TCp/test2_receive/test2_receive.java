


package Basic8_Internet.test3_TCp.test2_receive;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class test2_receive {
    public static void main(String[] args) throws IOException {
        // create tcp receive socket : the serversocket
        ServerSocket ss = new ServerSocket(12345);

        // lsiten the socket and accept it(for 3 times hand shake)
        Socket s = ss.accept();

        // get the input stream and receive the data
        InputStream inputStream = s.getInputStream();
        // create a volumer
        byte[] datas = new byte[1024];
        int len = inputStream.read(datas);
        System.out.println("接收到 " + new String(datas, 0, len));

        ss.close();

    }
}
