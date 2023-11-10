package com.argo.app;

import com.argo.bean.Cat;
import com.argo.config.SpringConfig4;
import com.argo.config.SpringConfig6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App6 {

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig6.class);
        String[] names = ctx.getBeanDefinitionNames();
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("-----");
//        System.out.println(ctx.getBean(Dog.class));
    }

}
