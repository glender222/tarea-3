package com.prueba.demo.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.demo.Entity.Alumno;
import com.prueba.demo.Repository.AlumnoRepository;
import com.prueba.demo.Service.AlumnoService;
@Service
public class AlumnoServiceImpl implements AlumnoService{
@Autowired
private AlumnoRepository repository;

    @Override
    public Alumno create(Alumno c) {
        // TODO Auto-generated method stub
        return repository.save(c);
    }

    @Override
    public Alumno update(Alumno c) {
        // TODO Auto-generated method stub
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        repository.deleteById(id);
    }

    @Override
    public Optional<Alumno> read(Long id) {
        // TODO Auto-generated method stub
       return repository.findById(id);
    }

    @Override
    public List<Alumno> readAll() {
        // TODO Auto-generated method stub
        return repository.findAll();
    }

}
