package com.swat018;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context Initialized");
        sce.getServletContext().setAttribute("name", "jinwoo");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context Destroyed");
    }
}
