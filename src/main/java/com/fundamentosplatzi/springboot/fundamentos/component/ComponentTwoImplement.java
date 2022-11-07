package com.fundamentosplatzi.springboot.fundamentos.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class ComponentTwoImplement implements ComponentDependency{


    @Override
    public void Saludar() {
        System.out.println("hola desde el 2");
    }
}
