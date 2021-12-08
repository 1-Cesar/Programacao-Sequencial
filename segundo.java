package br.com.generation.exercicio;

import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int dia, ano, mes;
		
		System.out.println("Digite sua idade expressa em dias: ");
			dia = leia.nextInt();
		
		ano = dia / 365;
		mes = (dia % 365/30);
		dia = (dia%365)%30;
		
		System.out.println("Sua idade expressa em dias é: " + dia);
		System.out.println("Sua idade expressa em meses é: " + mes);
		System.out.println("Sua idade expressa em anos é: " + ano);
		
		leia.close();

	}

}
