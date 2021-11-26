/*
键盘输入
* 接受并且写道文件里面。
*
* */


package Basic8_Internet.test3_TCp.test4_exercise4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

public class reciver {
    public static void main(String[] args) throws IOException {
        // create the server socket
        ServerSocket ss = new ServerSocket(12345);
        // listen and return a socket
        Socket s = ss.accept();

        // get the data , 一次接受一个string
        BufferedReader reader = new BufferedReader(new InputStreamReader(s.getInputStream()));

        // 写入文件， 也是用buffer stream 写入
        BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("01Module\\files\\tcps.txt"));
        String line;
        while((line = reader.readLine()) != null) {
            bufferWriter.write(line);
            bufferWriter.newLine();
            bufferWriter.flush();
        }

        bufferWriter.close();
        ss.close();

    }
}
