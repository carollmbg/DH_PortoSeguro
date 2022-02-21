package Exercicios;

import java.util.Scanner;

public class ListaEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/* 8. Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100,
caso contrário imprimi-la com o valor zero.
*/
	
		int N;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um numero: ");
		N = leia.nextInt();
		
		
		if(N<100)
		{
			System.out.println("\nN = 0");	
		}
		
		else
		{
			System.out.println("\nN = "+N);
		}
		
		}

	}