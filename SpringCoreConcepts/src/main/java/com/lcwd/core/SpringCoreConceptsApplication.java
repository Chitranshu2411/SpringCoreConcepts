package com.lcwd.core;

import com.lcwd.core.couple.Samosa;
import com.lcwd.core.scope.Pepsi;
import com.lcwd.core.scope.Soda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;     // IMPORTANT import
import com.lcwd.core.couple.Person;                 // Person import
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import test.Test;

@SpringBootApplication
//@ComponentScan(basePackages = {"", ""})
@ComponentScan(basePackages = {"com.lcwd.core", "test"})
public class SpringCoreConceptsApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);

//        Person personBean = context.getBean(Person.class);
//
//
//        System.out.println(personBean);
//        Test testBean = context.getBean(Test.class);
//        testBean.testing();
//        Animal cat = context.getBean("cat", Animal.class);
//        Animal dog = context.getBean("dog", Animal.class);
//        cat.play();
//        dog.play();
        // bean scope
        // first request for Pepsi bean
//        Pepsi bean = context.getBean(Pepsi.class);
//        System.out.println(bean);
//        bean.drink();
//
//        // second request for Pepsi bean
//        Pepsi bean1 = context.getBean(Pepsi.class);
//        System.out.println(bean1);
//
//        // third request for Pepsi bean
//        Pepsi bean2 = context.getBean(Pepsi.class);
//        System.out.println(bean2);
//        Pepsi pepsi = context.getBean(Pepsi.class);
//        System.out.println(pepsi);
//        Soda soda = pepsi.getSoda();
//        System.out.println(soda);
//
//        Pepsi pepsi1 = context.getBean(Pepsi.class);
//        System.out.println(pepsi1);
//        Soda soda1 = pepsi1.getSoda();
//        System.out.println(soda1);

    }

//    //declaring the bean using @Bean Annotation
//    @Bean(name = "samosaFromMain")
//
//    public Samosa getSamosa1() {
//
//        return new Samosa("Tandoori samosa");
//    }
//
//    @Bean(name = "samosa2")
//
//    public Samosa getSamosa2() {
//
//        return new Samosa("Meetha samosa");
//    }
}