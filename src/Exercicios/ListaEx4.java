package Exercicios;

import java.util.Scanner;

public class ListaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero � par ou �mpar, e 
		se � positivo ou negativo.*/
		
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

