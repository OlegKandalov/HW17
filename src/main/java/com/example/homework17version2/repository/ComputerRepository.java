package com.example.homework17version2.repository;
import com.example.homework17version2.entity.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepository extends JpaRepository<Computer, Long> {
    List<Computer> getAllByOrderByManufacturerDesc();
    List<Computer> getComputerByMemoryGreaterThan(int memory);
    List<Computer> getComputerByUsedTrue();
}
