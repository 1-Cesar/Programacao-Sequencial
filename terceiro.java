package br.com.generation.exercicio;

import java.util.Scanner;

public class terceiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempo, horas, minutos, segundos;
		
		System.out.println("Digite o tempo de duração do evento em segundos: ");
			tempo = leia.nextInt();
		
		horas = tempo / 3600;
		minutos = (tempo%3600)/60;
		segundos = (tempo%3600)%60;
		
		System.out.println("A duração do evento em horas foi: " + horas);
		System.out.println("A duração do evento em minutos foi: " + minutos);
		System.out.println("A duração do evento em segundos foi: " + segundos);
		
		leia.close();
		
	}

}
