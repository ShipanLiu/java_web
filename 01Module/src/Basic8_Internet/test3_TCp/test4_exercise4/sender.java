/*
* 同理 知道输入 886 才断开。
*
* */

package Basic8_Internet.test3_TCp.test4_exercise4;

import java.io.*;
import java.net.Socket;

public class sender { public static void main(String[] args) throws IOException {
    Socket s = new Socket("shipan", 12345);
    // write in ded loop
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // byte stream should be converted to character stream
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
    String line;
    while((line = reader.readLine()) != null) {
        if(line.equals("886")) {
            break;
        }
        // 把整个字符串 写进去。
        bufferedWriter.write(line);
        // 换到新的一行
        bufferedWriter.newLine();
        // 刷新
        bufferedWriter.flush();
    }
    s.close();
}

}
