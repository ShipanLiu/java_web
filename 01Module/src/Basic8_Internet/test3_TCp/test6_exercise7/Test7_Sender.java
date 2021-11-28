/*
* 发送本地的文件, 接受服务器反馈
* */

package Basic8_Internet.test3_TCp.test6_exercise7;

import java.io.*;
import java.net.Socket;

public class Test7_Sender {
    public static void main(String[] args) throws IOException {
        // create socket
        Socket s = new Socket("shipan", 12345);
        // create reader and writer
        BufferedReader reader = new BufferedReader(new FileReader("01Module\\files\\tcp.txt"));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        //send
        String line;
        while((line = reader.readLine()) != null) {
            writer.write(line);
            writer.newLine();
            writer.flush();
        }

        // 文件输出结束，send server a signal;
        // 要是不发这个的话， 在 执行s.close(); 之前， server 不知道你发送完全了没有。
          s.shutdownOutput();

        // 接受服务器的反馈
        BufferedReader feedBackReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String feedBack = feedBackReader.readLine();
        System.out.println("Feedback From Server: " + feedBack);

        reader.close();
        s.close();
    }
}
