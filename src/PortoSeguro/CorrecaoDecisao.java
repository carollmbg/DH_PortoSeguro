package PortoSeguro;

import java.util.Scanner;

public class CorrecaoDecisao {

	public static void main(String[] args) {
		
		int numero;
		
		try (Scanner leia = new Scanner(System.in)) {
				
		
		System.out.println("\nEscolha um n�mero inteiro:");
		numero = leia.nextInt();
		}
		
		
		if(numero<0)
		{
			if(numero % 2 == 0)
			{
				System.out.println("\nN�mero negativo e par.");
			}
			else
			{
				System.out.println("\nN�mero negativo e �mpar");
		    }
		}
		else
		{
			if(numero>=0)
			{
				if(numero % 2 == 0)
			{
					System.out.println("\nN�mero positivo e par.");
			    }
				else
				{
					System.out.println("\nN�mero positivo e �mpar");
				}
			}
	}

 }}

