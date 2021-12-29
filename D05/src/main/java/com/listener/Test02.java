package com.listener;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;


// 注解形式： 来表明 我在听
@WebListener
public class Test02 implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("listening to one attribute is added");

        System.out.println(event.getServletContext().getAttribute("name"));
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("listening to one attribute is replaced");

        System.out.println(event.getServletContext().getAttribute("name"));
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("a attribute is removed");
    }
}
