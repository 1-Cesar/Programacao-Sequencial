package br.com.generation.exercicio;

import java.util.Scanner;

public class primeiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int ano, mes, dia, idade_dia;
		
		System.out.println("Digite sua idade expressa em anos: ");
			ano = leia.nextInt();
		
		System.out.println("Digite sua idade expressa em meses: ");
			mes = leia.nextInt();
		
		System.out.println("Digite sua idade expressa em dias: ");
			dia = leia.nextInt();
		
		idade_dia = (ano * 365 + dia) + (mes * 30);
		
		System.out.println("Sua idade expressa em dias é igual à: " + idade_dia);
		
		leia.close();
	}

}
