package com.prueba.demo.Service;

import java.util.List;
import java.util.Optional;

import com.prueba.demo.Entity.Alumno;

public interface AlumnoService {
    Alumno create(Alumno c);
	Alumno update(Alumno c);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();
}
