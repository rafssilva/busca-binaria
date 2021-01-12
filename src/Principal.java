import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader input = new BufferedReader(
				new FileReader("cep_ordenado.dat"));
		
		
		ArrayList<CEP> ceps = new ArrayList<CEP>();
		
		String linha;
		
		
		while ((linha = input.readLine()) != null) {
			
			String[] array = new String[6];
			
            array[0] = linha.substring(0, 72).trim();
            array[1] = linha.substring(72, 144).trim();
            array[2] = linha.substring(144, 216).trim();
            array[3] = linha.substring(216, 288).trim();
            array[4] = linha.substring(288, 290).trim();
            array[5] = linha.substring(290, 299).trim();
            
            System.out.println(array[5]);
            
            ceps.add(new CEP(array[0], array[1], array[2], array[3],
            		array[4], Long.parseLong(array[5])));
            
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o CEP: ");
		
		long cep = Long.parseLong(scanner.nextLine());
		
		BuscaBinaria.buscar(ceps, 0, ceps.size() - 1, cep);
		
		input.close();
		scanner.close();
	}
}