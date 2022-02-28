package PortoSeguro;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int[][] numero = new int[2][3]; //2 dimensões, linha e coluna. 2 posições de linha, 3 posições de coluna. (inicia posição 0)
		int coluna,linha,quantPar=0,somaImpar=0;
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um número: ");
				numero[linha][coluna] = leia.nextInt();
				
				if(numero[linha][coluna] %2 == 0)
				{
					quantPar++;
				}
				else
				{
					somaImpar += numero[linha][coluna];
				}
			}
		}
		System.out.println("\nQuantidade de numeros pares: "+quantPar);
		System.out.println("\nSomatório dos números impares: "+somaImpar);
	}

}
