package com.example.homework17version2.service;

import com.example.homework17version2.Generate;
import com.example.homework17version2.entity.Computer;
import com.example.homework17version2.repository.ComputerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {
    private final ComputerRepository computerRepository;

    @Autowired
    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    public void AddComp(int number) {
        for (int i = 0; i < number; i++) {
            computerRepository.save(Generate.randomComp());
        }
    }

    public List<Computer> getAllSortedByName() {
        return computerRepository.getAllByOrderByManufacturerDesc();
    }

    public List<Computer> getCompWithStrongMemory(int memory) {
        return computerRepository.getComputerByMemoryGreaterThan(memory);
    }

    public List<Computer> getONlyUsedComputer() {
        return computerRepository.getComputerByUsedTrue();
    }
}
