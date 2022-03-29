package Exercicios;

import java.util.Scanner;

public class LacoRepeticao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		apresente no final o total do somatório, a média e o total de valores lidos. O programa
		deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
		positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
		negativo.  */
		
		int num = 0;
	
		Scanner leia = new Scanner(System.in);
		
		int soma = 0,media = 0, conta = 0;
		
						

		do
		{
			System.out.println("\nEscolha um número inteiro:");
			num = leia.nextInt();
			
			soma = soma + num;
			conta++;
			media = soma / conta;
			
		}	
		while(num >= 0 );
			
		
		
		System.out.println("\nSoma: "+soma+"\nMédia: "+media+"\nQuantidade de entradas: "+conta);
	    
			
		}
		
		
	}
	
	
		
		
		
			