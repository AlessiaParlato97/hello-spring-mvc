package it.lessons.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.RequestParam;

@RestController //calsse annotata, annotazione che rente la classe un "controllore"
public class HelloController {

	@GetMapping("/") //metodo che richiede delle risorse (predisponendo il server all'invocazione tramite get)
	public String hello(@RequestParam("nome") String nome) {
		return "Hello " + nome ;
	}
	
}
