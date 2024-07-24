package metodoAdd;

import java.util.ArrayList;
import java.util.Random;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		
            for (int i = 0; i<10; i++) {
			
			int numerosAleatorio = random.nextInt(10);
			numeros.add(numerosAleatorio);
		}
		
		
		     System.out.println(numeros);
		

	}

}
