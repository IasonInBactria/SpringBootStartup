package com.argo.config;


import com.argo.bean.Dog;
import org.springframework.context.annotation.Import;

@Import({Dog.class, DBConfig.class})
public class SpringConfig4 {
}
