package br.com.generation.exercicio;

import java.util.Scanner;

public class quinto {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		float nota1, nota2, nota3, media, peso1 = 2, peso2 = 3, peso3 = 5;
		
		System.out.println("Digite a primeira nota: ");
			nota1 = leia.nextFloat();
		System.out.println("Digite a segunda nota: ");
			nota2 = leia.nextFloat();
		System.out.println("Digite a terceira nota: ");
			nota3 = leia.nextFloat();
			
		media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
		
		if (media >= 10) {
			media = 10;
		}
		
		System.out.println("A média ponderada do aluno corresponde à: " + media);
		
		leia.close();
					
		
		
	}

}
