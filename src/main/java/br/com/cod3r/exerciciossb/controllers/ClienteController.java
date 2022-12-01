package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(2, "Cristian", "4923492321");
	}
	
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) {
		return new Cliente(id, "Crirstian", "43242343242");
	}
	
	@GetMapping()
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "Marcia", "123039221");
	}
}
