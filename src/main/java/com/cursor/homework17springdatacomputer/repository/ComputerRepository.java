package com.cursor.homework17springdatacomputer.repository;

import com.cursor.homework17springdatacomputer.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {
    Computer findComputerByName(String name);
}
