package exercicioJava;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		float Numero1;
		float Numero2;
		float Numero3;
		float Numero4;
		float Diferença;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Numero 1");
		Numero1 = leia.nextFloat();
		
		System.out.println("Numero 2");
		Numero2 = leia.nextFloat();
		
		System.out.println("Numero 3");
		Numero3 = leia.nextFloat();
		
		System.out.println("Numero 4 ");
		Numero4 = leia.nextFloat();
		
		Diferença = (Numero1 * Numero2)-(Numero3 * Numero4);
		
		System.out.println("A Diferença é " + Diferença);
		
		

	}

}
