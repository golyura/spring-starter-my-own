package com.gol.spring;

import com.gol.spring.database.pool.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
//      clazz -> String -> Map<String, Object>
        var connectionPool = context.getBean("p1", ConnectionPool.class);
        var connectionPool2 = context.getBean("p4", ConnectionPool.class);
        System.out.println(connectionPool);
        System.out.println(connectionPool2);
    }
}
