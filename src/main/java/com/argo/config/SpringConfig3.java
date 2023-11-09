package com.argo.config;


import com.argo.bean.Dog;
import com.argo.bean.DogFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan({"com.argo.bean", "com.argo.config"})
public class SpringConfig3 {
    @Bean
    public DogFactoryBean Dog(){
        return new DogFactoryBean();
    }
}
