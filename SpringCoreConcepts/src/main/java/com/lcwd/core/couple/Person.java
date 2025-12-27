package com.lcwd.core.couple;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    @Getter
    @Autowired
    Animal animal;
    @Getter
    @Autowired
    Student student;
    @Autowired
    @Qualifier("samosa1")
   private Samosa samosa;

    //@Autowired
    public Person(Animal animal, Student student) {
        System.out.println("Calling constructor.. autowiring");
        this.animal = animal;
        this.student = student;
    }

    //    // using autowired on setter : animal
    //@Autowired
    public void setAnimal(Animal animal) {
        System.out.println("setting animal");
        this.animal = animal;
    }

    //    // using autowired on setter : student
    @Autowired
    public void setStudent(Student student) {
        System.out.println("setting student");
        this.student = student;
    }

    public void playWithAnimal() {
        animal.play();
        student.detail();
        //samosa.eat();
    }
}