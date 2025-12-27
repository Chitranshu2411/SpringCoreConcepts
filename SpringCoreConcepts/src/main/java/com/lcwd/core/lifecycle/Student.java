package com.lcwd.core.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
    public Student() {
        System.out.println("# : creating student");
    }

    @PostConstruct
    public void created() {
        //some initialization
        System.out.println("# : Student bean is created : created()");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("# : bye bye student bean : destroy()");
    }
}