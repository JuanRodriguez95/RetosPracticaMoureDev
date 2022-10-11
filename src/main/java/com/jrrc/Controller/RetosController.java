package com.jrrc.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrrc.Service.RetosService;

@RestController
@RequestMapping("/retos")
public class RetosController {

	@Autowired
	private RetosService retos;
	
	@GetMapping("/fizzbuzz")
	public ResponseEntity<?> retornarPorId() {			
			return new ResponseEntity<List<String>>(retos.retoFizzBuzz(), HttpStatus.OK);			
	}	
}
