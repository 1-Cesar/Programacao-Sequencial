package br.com.generation.exercicio;

import java.util.Scanner;

public class oitavo {

	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);	
	
	float custo_fabrica, distribuidor, impostos;
	
	System.out.println("Digite o custo de f�bica do carro: ");
		custo_fabrica = leia.nextFloat();
	
	distribuidor = (28/100) * custo_fabrica + custo_fabrica;
	impostos = (45/100) * custo_fabrica + custo_fabrica;
	
	custo_fabrica = custo_fabrica + distribuidor + impostos;
	
	System.out.println("O custo ao consumidor ser� de: " + custo_fabrica);
	
	leia.close();

	}

}
