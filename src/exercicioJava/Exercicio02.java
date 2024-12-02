package exercicioJava;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		float Nota01;
		float Nota02;
		float Nota03;
		float Nota04;
		float MediaFinal;
	 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nota 01");
		Nota01 = leia.nextFloat();
		
		System.out.println("Nota 02");
		Nota02 = leia.nextFloat();
		
		System.out.println("Nota 03");
		Nota03 = leia.nextFloat();
		
		System.out.println("Nota 04");
		Nota04 = leia.nextFloat();
		  
		MediaFinal = (Nota01 + Nota02 + Nota03 + Nota04) / 4;
		
		System.out.println("Media final é " + MediaFinal ); 
	
	}

}
