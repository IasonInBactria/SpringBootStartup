package com.argo.app;

import com.argo.config.SpringConfig3;
import com.argo.config.SpringConfig32;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App32 {

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig32.class);
        String[] names = ctx.getBeanDefinitionNames();
        for(String name: names){
            System.out.println(name);
        }
    }

}
