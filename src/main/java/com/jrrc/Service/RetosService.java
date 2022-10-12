package com.jrrc.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RetosService {

	
	public List<String> retoFizzBuzz(){
		List<String> resultado = new ArrayList<>();
		for(int i=1;i<=100;i++) {
			if((i % 3 == 0) && (i%5 == 0) ) {
				resultado.add("fizzbuzz");
			}else if((i % 3) == 0){
					resultado.add("fizz");
				}else if((i % 5) == 0){
					resultado.add("buzz");
				}else {
					resultado.add(String.valueOf(i));
				}
			}	
		return resultado;
	}
	
	public Boolean esAnagrama(String primerPalabra, String segundaPalabra) {
		char[] palabraUno = primerPalabra.toLowerCase().toCharArray();
		char[] palabraDos = segundaPalabra.toLowerCase().toCharArray();
		int coincidencias = 0;
		
		if((palabraUno.length != palabraDos.length) ) {
			return false;
		}else {
			for (int i = 0; i < palabraUno.length ; i++) {
				for (int j = 0; j < palabraDos.length; j++) {
					if(palabraUno[i] == palabraDos[j]) {
						coincidencias++;
					}
				}			
			}
			if(coincidencias == palabraUno.length) {
				return true;
			}
		}
		return false;
	}
	
}
