package PortoSeguro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecao2 {
	//Demonstra lançamento de uma exceção quando ocorre divisão por 0
	public static int quociente( int numerador, int denominador) throws ArithmeticException
	{
		return numerador / denominador;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		
		//Determina se mais entradas são necessárias
		boolean continueLoop = true;
		
		do
		{
			try
			{
				System.out.println("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				
				int resultado = quociente(numerador,denominador);
				System.out.printf("\nResultado: %d / %d = %d",numerador,denominador,resultado);
				continueLoop = false;
			}//Fim do try
			
			catch(InputMismatchException inputMismatchException )
			{
				System.err.printf("\n\nException: %s\n", inputMismatchException);
				//Limpeza do cache
				leia.nextLine();
				
				System.out.println("\nEntre com um valor tipo inteiro.\nPor favor tente novamente.");
			}
			catch(ArithmeticException arithmeticException)
			{
				System.err.printf("\n\nException: %s\n", arithmeticException);
				System.out.println("\nNunca, jamais! Dividirás por 0. Por favor tente novamente com outro denominador.");
			}
						
		}
		while(continueLoop);

	}

}
