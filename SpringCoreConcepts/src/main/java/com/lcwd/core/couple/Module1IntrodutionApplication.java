package com.lcwd.core.couple;

import com.lcwd.core.PaymentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Module1IntrodutionApplication {
    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(Module1IntrodutionApplication.class, args);

        PaymentService paymentServiceObj = context.getBean(PaymentService.class);
        paymentServiceObj.pay();
    }
}