package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@GetMapping
	public String listarAll() {
		return "Listar All";
	}
	
	@GetMapping("/{id}")
	public String listarOne(@PathVariable String id) {
		return "Listar Id " + id;
	}
	
	@PostMapping
	public String crear() {
		return "creado";
	}
	
	@PutMapping("/{id}")
	public String actualizar(String id) {
		return "Actualizado" +id;
	}
	
	@DeleteMapping("/{id}")
	public String eliminar(String id) {
		return "Eliminado" +id;
	}
}
