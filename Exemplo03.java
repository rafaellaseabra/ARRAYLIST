package metodoAdd;
import java.util.ArrayList;
public class Exemplo03 {

	public static void main(String[] args) {
	    
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
		numeros.add(10);
		
		System.out.println("acessando elemento: " + numeros.get(0));
		System.out.println(numeros.get(0));
		
		
		numeros.set (1,25);
		System.out.println("modificando a primeira posição: " + numeros.get(1));
		
		numeros.remove(0);
		System.out.println("removendo " +numeros.get(0));
		
		System.out.println(numeros.size());
		

	}

}
