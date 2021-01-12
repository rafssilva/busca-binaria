import java.util.ArrayList;

public class BuscaBinaria {
	
	
	public static boolean buscar(ArrayList<CEP> ceps, int inicio,
			int fim, long elemento) {
		
		
		int meio = (inicio + fim) / 2;
		
		
		if(ceps.get(meio).getCep() == elemento) {
			
			System.out.println("Elemento encontrado!");
			System.out.println(ceps.get(meio));
			return true;
		}
		else
			if(inicio >= fim) {
			
				System.out.println("Elemento NÃO encontrado!");
				return false;
			}
			else
				if(ceps.get(meio).getCep() < elemento) {
				
					return buscar(ceps, meio + 1, fim, elemento);
				}
				else
					return buscar(ceps, inicio, meio - 1, elemento);
		}
}