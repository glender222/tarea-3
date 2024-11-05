package com.prueba.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.demo.Entity.Carrera;
import com.prueba.demo.Repository.CarreraRepository;
import com.prueba.demo.Service.CarreraService;
@Service

public class CarreraServiceImpl implements CarreraService{
@Autowired
private CarreraRepository repository;
    @Override
    public Carrera create(Carrera c) {
        // TODO Auto-generated method stub
        return repository.save(c);
    }

    @Override
    public Carrera update(Carrera c) {
        // TODO Auto-generated method stub
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

    @Override
    public Optional<Carrera> read(Long id) {
        // TODO Auto-generated method stub
        return repository.findById(id);
    }

    @Override
    public List<Carrera> readAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

}
