package com.prueba.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.demo.Entity.Alumno;
@Repository

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{

}
