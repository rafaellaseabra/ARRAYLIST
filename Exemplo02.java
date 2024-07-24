package metodoAdd;
import java.util.ArrayList;
import java.util.Arrays;
public class Exemplo02 {

	public static void main(String[] args) {
	 
		String[]disciplinas= {"Matemática","Filosofia", "História","Física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(disciplinas));
		novaLista.add("Geografia");
		novaLista.add("Língua Inglesa");
		novaLista.add("Educação Física");
		novaLista.add ("Espanhol");
		
		for (String i: novaLista) {
			System.out.println("Disciplina: " + i);
		}

	}

}
