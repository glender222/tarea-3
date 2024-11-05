package com.prueba.demo.Service;

import java.util.List;
import java.util.Optional;

import com.prueba.demo.Entity.Carrera;

public interface CarreraService {
    Carrera create(Carrera c);
	Carrera update(Carrera c);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();
}
