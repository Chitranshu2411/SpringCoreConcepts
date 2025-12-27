package com.lcwd.core.couple;

import org.springframework.stereotype.Component;

@Component("cat")
//@Qualifier("cat")
//@Primary

public class Cat implements Animal {
    @Override
    public void play(){
        System.out.println("Cat is playing");
    }
}