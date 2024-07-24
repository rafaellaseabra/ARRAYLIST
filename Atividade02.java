package metodoAdd;

import java.util.ArrayList;
import java.util.Random;

public class Atividade02 {

	public static void main(String[] args) {
		
		int mult=0;
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 0; i<10; i++) {
			
			int numerosAleatorio = random.nextInt(10);
			numeros.add(numerosAleatorio);
		}
		  System.out.println(numeros);
		
		for (int numero:numeros) {
		
			mult= (numero * 2);
			
			System.out.println( numero+ " x 2 = " + mult);
	}

		
	}

}
