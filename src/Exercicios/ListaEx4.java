package Exercicios;

import java.util.Scanner;

public class ListaEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e 
		se é positivo ou negativo.*/
		
		int numero;
		
		try (Scanner leia = new Scanner(System.in)) {
				
		
		System.out.println("\nEscolha um número inteiro:");
		numero = leia.nextInt();
		}
		
		
		if(numero<0)
		{
			if(numero % 2 == 0)
			{
				System.out.println("\nNúmero negativo e par.");
			}
			else
			{
				System.out.println("\nNúmero negativo e ímpar");
		    }
		}
		else
		{
			if(numero>=0)
			{
				if(numero % 2 == 0)
			{
					System.out.println("\nNúmero positivo e par.");
			    }
				else
				{
					System.out.println("\nNúmero positivo e ímpar");
				}
			}
	}

 }}

