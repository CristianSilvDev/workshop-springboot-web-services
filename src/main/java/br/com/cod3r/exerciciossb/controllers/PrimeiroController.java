package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	/**
	 *  GetMapping e RequestMapping(method = RequestMethod.GET funcionam da mesma forma;
	 * @return
	 */
	@GetMapping()
	public String ola() {
		return "Olá Spring Boot!";
	}
}
