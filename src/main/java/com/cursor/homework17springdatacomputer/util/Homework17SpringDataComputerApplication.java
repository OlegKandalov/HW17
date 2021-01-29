package com.cursor.homework17springdatacomputer.util;

import com.cursor.homework17springdatacomputer.Generate;
import com.cursor.homework17springdatacomputer.model.Computer;
import com.cursor.homework17springdatacomputer.service.impl.ComputerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Homework17SpringDataComputerApplication {
    @Autowired
    ComputerServiceImpl computerService;
    public static void main(String[] args) {
        SpringApplication.run(Homework17SpringDataComputerApplication.class, args);
    }
    Computer computer = Generate.randomComp();
    @PostConstruct
    void test() {
        computerService.addComp(computer);
    }
}
