package br.com.generation.exercicio;

import java.util.Scanner;
public class setimo {

	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	
	float a,x,b,y,c,d,e,f,controle1,controle2;
	
	System.out.println("Digite o coeficiente A: ");
		a = leia.nextFloat();
	System.out.println("Digite o coeficiente B: ");
		b = leia.nextFloat();
	System.out.println("Digite o coeficiente C: ");
		c = leia.nextFloat();
	System.out.println("Digite o coeficiente D: ");
		d = leia.nextFloat();
	System.out.println("Digite o coeficiente E: ");
		e = leia.nextFloat();
	System.out.println("Digite o coeficiente F: ");
		f = leia.nextFloat();
		
	x = (c*e - b*f) / (a*e - b*d);
	y = (a*f - c*a) / (a*e - b*d);
	
	controle1 = (a*e - b*d);
	controle2 = (a*e - b*d);
	
	if ((controle1 > 0 ) && (controle2 > 0)) {
	
	System.out.println("O valor de X corresponde à: " + x);
	System.out.println("O valor de Y corresponde à: " + y);			
		
	}
	else {
		System.out.println("Impossível dividir por 0");
	}
	
	leia.close();
	}
}


