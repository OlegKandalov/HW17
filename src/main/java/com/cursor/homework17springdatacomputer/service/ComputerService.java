package com.cursor.homework17springdatacomputer.service;

import com.cursor.homework17springdatacomputer.model.Computer;

import java.util.List;

public interface ComputerService {
    void addComp(Computer computer);
    void delete(Long id);
    Computer getByName(String string);
    Computer editComp(Computer computer);
    List<Computer> getAll();
}
