package metodoAdd;

import java.util.ArrayList;
import java.util.Random;

public class Atividade001 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
		for (int i = 0; i<10; i++) {
			
			int numerosAleatorio = random.nextInt(10);
			numeros.add(numerosAleatorio);
		}
		
		
		System.out.println(numeros);
		numeros.remove(4);

         
		for (int numero:numeros) {
			System.out.println(numero);
		}
		
		
		
	}

}
