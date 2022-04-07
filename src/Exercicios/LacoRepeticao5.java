package Exercicios;

import java.util.Scanner;

public class LacoRepeticao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1- Faça um programa que mostre uma contagem na tela de 233 a 456, só que
		contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.*/

		
		int num = 230 , cont = 0;
		
		while(num <= 451)
		{	
				if(300 < num && num < 400)
				{
					cont = 3;
				}
				else
				{
					cont = 5;
				}
				num += cont;
				System.out.println(num);
		}
		
		
		/* 2- Faça um programa que pegue um número do teclado e calcule a soma de todos os
		números de 1 até ele. Ex.: o usuário entra 7, o programa vai mostrar 28, pois
		1+2+3+4+5+6+7=28 */
		
		int numero = 0 , soma = 0, contador = 0 ;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEscolha um número do teclado:");
		numero = leia.nextInt();
		
		while(contador < numero )
		{
			contador++ ;
			soma += contador ;
		}
		
		System.out.println(soma);
		

		
		}
	}
