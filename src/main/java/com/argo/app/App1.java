package com.argo.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Object cat = ctx.getBean("cat");
        System.out.println("cat");
        String[] names = ctx.getBeanDefinitionNames();
        for (String name: names){
            System.out.println(name);
        }
    }
}
