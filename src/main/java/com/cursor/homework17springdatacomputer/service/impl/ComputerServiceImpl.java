package com.cursor.homework17springdatacomputer.service.impl;

import com.cursor.homework17springdatacomputer.model.Computer;
import com.cursor.homework17springdatacomputer.repository.ComputerRepository;
import com.cursor.homework17springdatacomputer.service.ComputerService;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ComputerServiceImpl implements ComputerService {
     ComputerRepository computerRepository;

    @Autowired
    public ComputerServiceImpl(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    @Override
    public void addComp(Computer computer) {
        computerRepository.save(computer);
    }

    @Override
    public void delete(Long id) {
        computerRepository.deleteById(id);
    }

    @Override
    public Computer getByName(String name) {
        return computerRepository.findComputerByName(name);
    }

    @Override
    public Computer editComp(Computer computer) {
        return computerRepository.saveAndFlush(computer);
    }

    @Override
    public List<Computer> getAll() {
        return computerRepository.findAll();
    }
}
