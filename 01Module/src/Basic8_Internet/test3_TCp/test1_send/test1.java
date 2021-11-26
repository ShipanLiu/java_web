/*
* Exception in thread "main" java.net.ConnectException: Connection refused: connect
* reasons: because the tcp needs 3 times hand shake,(and you did not even write the server)
*
* */


package Basic8_Internet.test3_TCp.test1_send;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class test1 {
    public static void main(String[] args) throws IOException {
        // create tcp  stream
        Socket socket = new Socket("shipan", 12345);

        // get the output stream(相当于 send out)
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("jibadan".getBytes());

        // close
        socket.close();


    }
}
