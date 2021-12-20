package test1_serverlet.test1_servlet_Demo;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class ServletDemo01 extends GenericServlet {
    // 只需要重写service方法就可以了。
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        // request 来发送请求。
        // response 的作用是 回复user。
        System.out.println("Yes! The server is there!!!");
        System.out.println("Yes! The server is there!!!");
        System.out.println("Yes! The server is there!!!");
    }
}
