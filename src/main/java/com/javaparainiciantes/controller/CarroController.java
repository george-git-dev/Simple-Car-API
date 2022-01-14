package com.javaparainiciantes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaparainiciantes.model.Carro;
import com.javaparainiciantes.repository.CarroRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
@CrossOrigin(allowedHeaders = "*", origins = "*")
public class CarroController {

	@Autowired
	CarroRepository repository;

	@GetMapping("/carro")
	public List<Carro> getAllCarros() {
		return repository.findAll();
	}

	@GetMapping("/carro/{id}")
	public Carro getCarroById(@PathVariable Long id) {
		return repository.findById(id).get();
	}

	@PostMapping("/carro")
	public Carro saveCarro(@RequestBody Carro carro) {
		return repository.save(carro);
	}

	@DeleteMapping("/carro/{id}")
	public void deleteCarro(@PathVariable Long id) {
		repository.deleteById(id);
	}

	/* Teste de resposta */
	/*
	 * @GetMapping(path = "/api/status") public String check() { return
	 * "Onlineeeeee"; }
	 */

}
