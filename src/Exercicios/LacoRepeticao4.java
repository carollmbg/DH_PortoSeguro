package Exercicios;

import java.util.Scanner;

public class LacoRepeticao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*4 - Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele 
		 * por tr�s (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se
		 *  o usu�rio digita 5, deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.*/
		
		int num = 1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscolha um n�mero inteiro:");
		num = leia.nextInt();
		
		int soma = 0,media = 0, conta = 0;
		
		
		while(num < 100 )
		{
			num = num * 3;
			System.out.println(num);
			
		}
	}		
				
		
}		


