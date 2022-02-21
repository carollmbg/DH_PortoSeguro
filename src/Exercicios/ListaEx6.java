package Exercicios;

import java.util.Scanner;

public class ListaEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*6. Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/

		int idade;
		
			try (Scanner leia = new Scanner(System.in)) {
			
			System.out.println("\nDigite a idade do nadadore: ");
			idade = leia.nextInt();
		}
		
		
		if(idade<5)
		{
			System.out.println("\nNadadore ainda não tem idade para ser do Infantil A.");
		}
		else if(idade>=5 && idade<=7)
		{
			System.out.println("\nNadadore faz parte do grupo Infantil A.");
		}
		else if(idade>=8 && idade<=11)
		{
			System.out.println("\nNadadore faz parte do grupo Infantil B.");
		}
		else if(idade>=12 && idade<=13)
		{
			System.out.println("\nNadadore faz parte do grupo Juvenil A.");
		}
		else if(idade>=14 && idade<=17)
		{
			System.out.println("\nNadadore faz parte do grupo Juvenil B.");
		}
		else
		{
			System.out.println("\nNadadore faz parte do grupo Adulto.");
		}
			
	}

}
