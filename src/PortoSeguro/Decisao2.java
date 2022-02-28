package PortoSeguro;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aula 3
		
		float n1,n2,resultado = 0;
		int op = 0;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro número");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com o segundo número");
		n2 = ler.nextFloat();
		
		//Calculadora
		
		System.out.println("\n\tCalculadora");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Subtração");
		System.out.println("\n3 - Multiplição");
		System.out.println("\n4 - Divisão");
		System.out.println("\nEscolha o número da operação:");
		op = ler.nextInt();

		switch(op)
		{
		case 1:
			resultado = n1 + n2;
			break;
		case 2:
			resultado = n1 - n2;
			break;
		case 3:
			resultado = n1 * n2;
			break;
		case 4:
			if(n2 == 0)
			{
				System.out.println("\nNUNCA, JAMAIS, DIVIDIRÁS POR 0"); //homenagem singela a fala profe Elaine de matematica da USJT 2014
			}
			else
			resultado = n1 / n2;	
			break;
		default:
			System.out.println("\nNúmero inválido");
					
		}
		
		System.out.println("\nResultado "+resultado);

	}

}
