package com.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


// 注解形式： 来表明 我在听
@WebListener
public class Test01 implements ServletContextListener {

    // use this to delect a servletContext is created
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("the servleContext is created");

        // get the object
        ServletContext servletContext = sce.getServletContext();
        System.out.println(servletContext);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext is destroyed");
    }
}
