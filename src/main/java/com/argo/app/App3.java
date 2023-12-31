package com.argo.app;

import com.argo.config.SpringConfig3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig3.class);
        String[] names = ctx.getBeanDefinitionNames();
        for (String name: names){
            System.out.println(name);
        }
        System.out.println(ctx.getBean("Dog"));
    }
}
