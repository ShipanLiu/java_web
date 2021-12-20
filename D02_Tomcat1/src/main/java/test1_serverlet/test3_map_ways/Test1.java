package test1_serverlet.test3_map_ways;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
* vip:  discount 9
*
* vvip: discount 10
*
*
* servletConfig + servletContext
*
*
* */


public class Test1 extends HttpServlet {

    // 声名一下ServletConfig 对象
    private ServletConfig config;

    // ServletConfig 在init的时候才调用， 因此， override init method
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // define a price
        int price = 1000;

        // 获取 用户访问的路径
        String path = req.getRequestURI();
        String lastPast = path.substring(path.lastIndexOf("/"));

        // 条件判断
        switch(lastPast) {
            case "/vip" : {
                System.out.println("卧槽discount 9: " + price * 0.9);
                break;
            }
            case "/vvip" : {
                System.out.println("卧槽卧槽discount 5: " + price * 0.5);
                break;
            } default: {
                System.out.println("切normal price: " + price);
            }
        }

        //延时SevletConfig常用的方法。

        // get value according to key
        String encoding = config.getInitParameter("encoding");
        System.out.println(encoding);

        System.out.println("*******************************");

        // get all keys
        Enumeration<String> keys = config.getInitParameterNames();
        // 遍历枚举。
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println(key + " : " + config.getInitParameter(key));
            //          encoding : UTF-8
            //          desc : This is from ServletConfig
        }


        System.out.println("**********************************");


        //获取Servlet的名称
        System.out.println(config.getServletName()); // Test1


        //得到ServletContext对象
//        System.out.println(config.getServletContext());

        // org.apache.catalina.core.ApplicationContextFacade@56b7d805


        // ServletContext
        ServletContext servletContext = config.getServletContext();


        // get value via key
        System.out.println("&&&&&&&&&&&&&&&&");
        System.out.println(servletContext.getInitParameter("globalDesc"));
        System.out.println("&&&&&&&&&&&&&&&&");

        // context path
        System.out.println(servletContext.getContextPath()); // /tomcat1    就是在配置里面 delivery下面的application context
        System.out.println("&&&&&&&&&&&&&&&&");


        // real path
        System.out.println("&&&&&&&&&&&&&&&&");
        System.out.println(servletContext.getRealPath("/"));  // "/"代表 means the root path: also webapp folder
        // 用途： 获取文件的绝对路径
        // 输出： H:\JAVA\project\Basic\Tomcat1\target\Tomcat1-1.0-SNAPSHOT\

        // 举例： 获取 webapp 下面的b.txt
        String pathB = servletContext.getRealPath("/bbb.txt");
        System.out.println(pathB); // H:\JAVA\project\Basic\Tomcat1\target\Tomcat1-1.0-SNAPSHOT\bbb.txt

        // 获取 WEB-INF下面的
        System.out.println(servletContext.getRealPath("/WEB-INF/ccc.txt")); // H:\JAVA\project\Basic\Tomcat1\target\Tomcat1-1.0-SNAPSHOT\WEB-INF\ccc.txt

        // 获取 src 下面的aaa.txt
        //无法获取， 所以文件 因该定义在 webapp下面。

        /*
        * servletContext 的另外一个用处： 共享数据
        *
        * */

        servletContext.setAttribute("username", "jiba");

        Object username = servletContext.getAttribute("username");
        System.out.println(username);

        servletContext.removeAttribute("username");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
