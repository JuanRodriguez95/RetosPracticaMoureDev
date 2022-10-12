package com.jrrc.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrrc.Service.RetosService;

@RestController
@RequestMapping("/retos")
public class RetosController {

	@Autowired
	private RetosService retos;
	
	
	/**
	 * 
	 */
	/**
	 * Reto #0
	 * EL FAMOSO "FIZZ BUZZ"
	 * Fecha publicación enunciado: 27/12/21
	 * Fecha publicación resolución: 10/10/22
	 * Dificultad: FÁCIL
	 * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
	 * - Múltiplos de 3 por la palabra "fizz".
	 * - Múltiplos de 5 por la palabra "buzz".
	 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
	 *
	 */
	@GetMapping("/fizzbuzz")
	public ResponseEntity<?> retornarPorId() {			
			return new ResponseEntity<List<String>>(retos.retoFizzBuzz(), HttpStatus.OK);			
	}
	
	
	/*
	 * Reto #1
	 * ¿ES UN ANAGRAMA?
	 * Fecha publicación enunciado: 03/01/22
	 * Fecha publicación resolución: 11/10/22
	 * Dificultad: MEDIA
	 *
	 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
	 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
	 * NO hace falta comprobar que ambas palabras existan.
	 * Dos palabras exactamente iguales no son anagrama.
	 * */
	@GetMapping("/anagrama/{palabraUno}/{palabraDos}")
	public ResponseEntity<?> retornarPorId(@PathVariable String palabraUno,@PathVariable String palabraDos) {			
			return new ResponseEntity<Boolean>(retos.esAnagrama(palabraUno, palabraDos), HttpStatus.OK);			
	}
	
}
