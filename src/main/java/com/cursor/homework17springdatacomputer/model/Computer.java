package com.cursor.homework17springdatacomputer.model;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;


@Entity(name = "computer")
@Component
@Table
@Data
@Scope("prototype")
public class Computer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    int model;
    @Column
    private String manufacturer;
    @Column
    private String processor;
    @Column
    private int memory;
    @Column
    private boolean isNew;
    @Column
    private String materialType;
    @Column
    private double price;
    @Column
    private LocalDate release;

    public Computer(){}
    public Computer(int model,
                    String manufacturer,
                    String processor,
                    int memory,
                    boolean isNew,
                    String materialType,
                    double price,
                    LocalDate release){
        this.model = model;
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.memory = memory;
        this.isNew = isNew;
        this.materialType = materialType;
        this.price = price;
        this.release = release;
    }
}
