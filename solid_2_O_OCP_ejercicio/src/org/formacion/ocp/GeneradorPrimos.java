package org.formacion.ocp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GeneradorPrimos {

	
	public List<Integer> primos (int limit) {
		
		List<Integer> primos = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (esPrimo(i)) {
				primos.add(i);
			}
		}
		return primos;

	}
	
	private boolean esPrimo (int candidato) {
		for (int i = 2; i < candidato; i++) {
			if (candidato % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public List<Integer> inverse(int limit) { 
		return this.primos(limit).stream().sorted((n1, n2) -> n2 - n1).collect(Collectors.toList());
	}
}
