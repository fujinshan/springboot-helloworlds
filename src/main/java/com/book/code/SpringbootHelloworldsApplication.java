package com.book.code;

import com.book.code.servlet.MyServlet1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootHelloworldsApplication {

    @Bean
   public ServletRegistrationBean MyServlet1(){
       return new ServletRegistrationBean(new MyServlet1(),"/myServlet/*");
   }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldsApplication.class, args);
    }

}
