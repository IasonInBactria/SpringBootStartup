package com.argo.app;

import com.argo.config.SpringConfig32;
import com.argo.config.SpringConfig33;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App33 {

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig33.class);
        String[] names = ctx.getBeanDefinitionNames();
        for(String name: names){
            System.out.println(name);
        }
        System.out.println("-----");
//        System.out.println(ctx.getBean("springConfig33"));
        SpringConfig33 config33 = ctx.getBean("springConfig33", SpringConfig33.class);
        System.out.println(config33.cat());
        System.out.println(config33.cat());
        System.out.println(config33.cat());
    }

}
