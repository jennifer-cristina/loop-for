import java.util.Scanner;

public class TesteFor {

	public static void main(String[] args) {
		// looping com while
		
		int i = 0;
		
		while (i < 10) {
			System.out.println(i + " - Senai");
			i++;
		}
		
		//looping com for
		
		System.out.println("FOR");
		
		
		for (int x = 0; x < 10; x++) {
			System.out.println(x + " - Senai");
		}
		
		//Testando outras condicionais no for 
		Scanner leitor = new Scanner(System.in);
		String resposta = "s";
		
		for (int y = 0; resposta.equalsIgnoreCase("s"); y++) {
			System.out.println(y + " - Senai");
			System.out.println("Imprimir novamente (S/N)?");
			resposta = leitor.next();
			
			leitor.close();
			
		//Tabuada do 8 usando for 
			System.out.println("");
			System.out.println("______________________________________________");
			System.out.println("                  TABUADA DO 8");
			
			for (int z = 0; z <= 10; z++) {
				System.out.printf("8 X %d = %d\n", z, 8 * z);
				
			}
			
		//Usando %d e %s
			
			System.out.println("_________________________________________________");
			String nome = "Maria";
			int idade = 17;
			
			System.out.println("A " + nome + " tem " + idade + " anos. ");
			System.out.printf("A %s tem %d anos.", nome, idade);
			
			
		
		}
	}

}
