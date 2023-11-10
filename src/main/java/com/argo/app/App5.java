package com.argo.app;

import com.argo.bean.Cat;
import com.argo.bean.Dog;
import com.argo.config.SpringConfig4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);
        ctx.registerBean("Tom", Cat.class);
        String[] names = ctx.getBeanDefinitionNames();
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("-----");
//        System.out.println(ctx.getBean(Dog.class));
    }

}
