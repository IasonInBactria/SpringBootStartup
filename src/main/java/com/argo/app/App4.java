package com.argo.app;

import com.argo.bean.Dog;
import com.argo.config.SpringConfig33;
import com.argo.config.SpringConfig4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App4 {

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);
        String[] names = ctx.getBeanDefinitionNames();
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("-----");
        System.out.println(ctx.getBean(Dog.class));
    }

}
