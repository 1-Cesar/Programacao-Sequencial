package br.com.generation.exercicio;

import java.util.Scanner;

public class quarto {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int a,b,c;
	float d,r,s;
	
	System.out.println("Digite o n�mero correspondente � A: ");
		a = leia.nextInt();
	System.out.println("Digite o n�mero correspondente � B: ");
		b = leia.nextInt();
	System.out.println("Digite o n�mero correspondente � C: ");
		c = leia.nextInt();
	
	r = (float) Math.pow ((a+b),2);
	s = (float) Math.pow ((b+c),2);
	d = (r+s)/2;
	
	System.out.println("O resultado de D �: " + d);	
	
	leia.close();
	}

}
