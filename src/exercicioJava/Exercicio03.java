package exercicioJava;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float SalarioBruto;
		float AdicionalNoturno;
		float HorasExtras;
		float Descontos;
		float SalarioLiquido;
		
		Scanner leia  = new Scanner(System.in);
		
		System.out.println("Salario Bruto");
		SalarioBruto = leia.nextFloat();
		
		System.out.println("Adicional Nortuno");
		AdicionalNoturno = leia.nextFloat();
		
		System.out.println("Horas Extras");
		HorasExtras = leia.nextFloat();
		
		System.out.println("Descontos");
		Descontos = leia.nextFloat();
		
		SalarioLiquido = SalarioBruto + AdicionalNoturno + (HorasExtras * 5 ) - Descontos;
		
		System.out.println("Salario Liquido é: " + SalarioLiquido);
		

	}

}
