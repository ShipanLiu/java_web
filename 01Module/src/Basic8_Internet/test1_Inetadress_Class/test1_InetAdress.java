package Basic8_Internet.test1_Inetadress_Class;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test1_InetAdress {
    public static void main(String[] args) throws UnknownHostException {

        //通过 电脑名称 获取 ip
        InetAddress adress = InetAddress.getByName("DESKTOP-BG9A886");

        System.out.println(adress);  //DESKTOP-BG9A886/192.168.233.1

        //输出
        System.out.println(adress.getHostName()); // DESKTOP-BG9A886
        System.out.println(adress.getHostAddress()); // 192.168.233.1





    }
}
