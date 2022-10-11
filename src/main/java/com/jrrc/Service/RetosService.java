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
	
}
