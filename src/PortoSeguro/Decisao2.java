package PortoSeguro;

import java.util.Scanner;

public class Decisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aula 3
		
		float n1,n2,resultado = 0;
		int op = 0;
		
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro n�mero");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com o segundo n�mero");
		n2 = ler.nextFloat();
		
		//Calculadora
		
		System.out.println("\n\tCalculadora");
		System.out.println("\n1 - Soma");
		System.out.println("\n2 - Subtra��o");
		System.out.println("\n3 - Multipli��o");
		System.out.println("\n4 - Divis�o");
		System.out.println("\nEscolha o n�mero da opera��o:");
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
				System.out.println("\nNUNCA, JAMAIS, DIVIDIR�S POR 0"); //homenagem singela a fala profe Elaine de matematica da USJT 2014
			}
			else
			resultado = n1 / n2;	
			break;
		default:
			System.out.println("\nN�mero inv�lido");
					
		}
		
		System.out.println("\nResultado "+resultado);

	}

}
