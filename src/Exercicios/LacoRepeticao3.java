package Exercicios;

import java.util.Scanner;

public class LacoRepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e
		apresente no final o total do somat�rio, a m�dia e o total de valores lidos. O programa
		deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores
		positivos. Ou seja, o programa deve parar quando o usu�rio fornecer um valor
		negativo.  */
		
		int num = 0;
	
		Scanner leia = new Scanner(System.in);
		
		int soma = 0,media = 0, conta = 0;
		
						

		do
		{
			System.out.println("\nEscolha um n�mero inteiro:");
			num = leia.nextInt();
			
			soma = soma + num;
			conta++;
			media = soma / conta;
			
		}	
		while(num >= 0 );
			
		
		
		System.out.println("\nSoma: "+soma+"\nM�dia: "+media+"\nQuantidade de entradas: "+conta);
	    
			
		}
		
		
	}
	
	
		
		
		
			