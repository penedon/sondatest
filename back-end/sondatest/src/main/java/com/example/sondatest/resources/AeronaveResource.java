package com.example.sondatest.resources;

import java.util.List;

import com.example.sondatest.models.Aeronave;
import com.example.sondatest.repository.AeronaveRepository;
import com.example.sondatest.specifications.AeronaveSpecification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping(value = "/")
public class AeronaveResource {

    @Autowired
    AeronaveRepository aeronaveRepository;

    @GetMapping(value="/aeronaves")
    public List<Aeronave> getAeronaves(){
        return aeronaveRepository.findAll();
    }

    @GetMapping(value="/aeronaves/find")
    public List<Aeronave> findAeronave(@RequestBody Aeronave aeronave){
        Specification<Aeronave> spec = new AeronaveSpecification(aeronave);
        return aeronaveRepository.findAll(spec);
    }

    @GetMapping(value="/aeronaves/{id}")
    public Aeronave getAeronave(@PathVariable(value="id") long id){
        return aeronaveRepository.findById(id);
    }

    @PostMapping(value="/aeronaves")
    public Aeronave postAeronave(@RequestBody Aeronave aeronave) {        
        return aeronaveRepository.save(aeronave);
    }
    
    @PutMapping(value="/aeronaves/{id}")
    public Aeronave putAeronave(@PathVariable(value="id") long id, @RequestBody Aeronave aeronave) {        
        return aeronaveRepository.save(aeronave);
    }
    
    @DeleteMapping(value="/aeronaves/{id}")
    public void deleteAeronave(@PathVariable(value="id") long id){
        aeronaveRepository.deleteById(id);
    }
}