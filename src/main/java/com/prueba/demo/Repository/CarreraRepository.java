package com.prueba.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.demo.Entity.Carrera;
@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long>{

}
