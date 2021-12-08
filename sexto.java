package br.com.generation.exercicio;

import java.util.Scanner;

public class sexto {

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	float x1, x2, y1, y2, raiz, potencia1, potencia2;
	
	System.out.println("Digite o primeiro valor correspondente a X: ");
		x1 = leia.nextFloat();
	System.out.println("Digite o segundo valor correspondente a X: ");
		x2 = leia.nextFloat();
	System.out.println("Digite o primeiro valor correspondente a Y: ");
		y1 = leia.nextFloat();
	System.out.println("Digite o segundo valor correspondente a Y: ");
		y2 = leia.nextFloat();
		
	potencia1 = (float) Math.pow(x2-x1, 2);
	potencia2 = (float) Math.pow(y2-y1, 2);
	raiz = (float) Math.sqrt(potencia1+potencia2);
	
	System.out.println("A distância entre os pontos corresponde à: " + raiz);
	
	leia.close();	
	
	}

}
