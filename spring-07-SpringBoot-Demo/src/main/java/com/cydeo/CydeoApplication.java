package com.cydeo;

import com.cydeo.model.Comment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CydeoApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Vladimer");
        comment.setText("Spring Framework");


       ApplicationContext container =  SpringApplication.run(CydeoApplication.class, args);


    }

}
