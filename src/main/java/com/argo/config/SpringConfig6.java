package com.argo.config;


import com.argo.bean.Dog;
import com.argo.bean.MyImportSelector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@Import(MyImportSelector.class)
public class SpringConfig6 {
}
