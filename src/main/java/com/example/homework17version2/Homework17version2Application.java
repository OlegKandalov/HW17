package com.example.homework17version2;

import com.example.homework17version2.entity.Computer;
import com.example.homework17version2.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication
public class Homework17version2Application {
    @Autowired
    ComputerService computerService;

    public static void main(String[] args) {
        SpringApplication.run(Homework17version2Application.class, args);
    }

    @PostConstruct
    void test() {
        computerService.AddComp(20);
        System.out.println("added 20 random computer");
        System.out.println("*************************");

        List<Computer> getAll = computerService.getAllSortedByName();
        System.out.println("sorted by first letter: ");
        for (Computer c : getAll) {
            System.out.println(c);
        }
        System.out.println("*************************");

        List<Computer> getListWithStrongMemory = computerService.getCompWithStrongMemory(16);
        System.out.println("computers with memory greater then 16 Gb: ");
        for (Computer c : getListWithStrongMemory) {
            System.out.println(c);
        }
        System.out.println("*************************");

        List<Computer> usedComputers = computerService.getONlyUsedComputer();
        System.out.println("list of used computers");
        for (Computer c: usedComputers) {
            System.out.println(c);
        }
    }
}
