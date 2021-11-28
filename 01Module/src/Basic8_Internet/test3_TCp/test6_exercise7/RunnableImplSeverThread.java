package Basic8_Internet.test3_TCp.test6_exercise7;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class RunnableImplSeverThread implements Runnable {
    private Socket s;

    public RunnableImplSeverThread(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        // get the data , 一次接受一个string
        BufferedReader reader = null;
        try {
            // 创建reader 开始接受。
            reader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            // 写入文件， 也是用buffer stream 写入
            // 解决重名的问题
//            int count = 0;
//            File file = new File("01Module\\files\\tcps[" + count + "].txt");
//            while(file.exists()) {
//                count ++;
//                file = new File("01Module\\files\\tcps[" + count + "].txt");
//            }
            // 或者用 uuid
            UUID uuid = UUID.randomUUID();
            String uuidStr = uuid.toString();
            File file = new File("01Module\\files\\tcps[" + uuidStr + "].txt");
            // 创建 writer
            BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(file));

            // 开始写。
            String line;
            while((line = reader.readLine()) != null) {
                bufferWriter.write(line);
                bufferWriter.newLine();
                bufferWriter.flush();
            }

            // 再写入文件成功之后， send the feedback;
            BufferedWriter feedBackWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            feedBackWriter.write("服务器接受文件成功");
            feedBackWriter.newLine();
            feedBackWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 释放资源
            try {
                s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
