package com.example.sondatest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.sondatest.models.Aeronave;

public interface AeronaveRepository extends JpaRepository<Aeronave, Long>, JpaSpecificationExecutor<Aeronave>{
    
    Aeronave findById(long id);

}