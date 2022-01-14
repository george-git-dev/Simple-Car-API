package com.javaparainiciantes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaparainiciantes.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Long> {

}
