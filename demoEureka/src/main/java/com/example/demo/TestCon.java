package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component("testCon")
@Configuration
public class TestCon {

    private Integer id;
    private String name;

    /*public Integer getId() {
        System.out.println("11111");
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    @Bean
    public String teacher(){
        Teacher teacher=new Teacher();
        teacher.setName("李四");
        System.out.println(1111);
        return "sss";
    }
}
