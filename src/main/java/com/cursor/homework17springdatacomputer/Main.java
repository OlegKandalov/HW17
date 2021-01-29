package com.cursor.homework17springdatacomputer;

import com.cursor.homework17springdatacomputer.model.Computer;
import com.cursor.homework17springdatacomputer.service.impl.ComputerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.annotation.PostConstruct;


public class Main {


    public static void main(String[] args) {
        final SpringApplication springApplication = new SpringApplication(Main.class);
    }


}
