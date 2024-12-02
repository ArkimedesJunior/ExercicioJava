package exercicioJava;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		float novoSalario;

		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o salario Atual:");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono ;
		
   
		System.out.println("O novo salario é " + novoSalario );
		
		
	
		

	}

}
