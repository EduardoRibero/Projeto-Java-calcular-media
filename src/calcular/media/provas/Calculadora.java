package calcular.media.provas;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número de provas realizadas: ");
		int numProvas = scanner.nextInt();
		
		double somaNotas = 0;
		
		for(int i = 0; i < numProvas; i++) {
			System.out.println("Digite a nota da prova "+ (i + 1) +":");
			somaNotas += scanner.nextDouble();		
		}
		
		double media = somaNotas / numProvas;
		
		System.out.println("Amedia de acordo com os dados informados é: " + media);

	}

}
