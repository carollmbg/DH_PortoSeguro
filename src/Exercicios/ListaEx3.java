package Exercicios;

import java.util.Scanner;

public class ListaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3. Desenvolva um sistema em que:
		Leia 4 (quatro) n�meros;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.*/
		
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,n4;
		double sn1,sn2,sn3,sn4;
		
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("\nEntre com o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("\nEntre com o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		System.out.println("\nEntre com o quarto n�mero: ");
		n4 = leia.nextInt();
		
		
		sn1 = Math.sqrt(n1);
		sn2 = Math.sqrt(n2);
		sn3 = Math.sqrt(n3);
		sn4 = Math.sqrt(n4);
		
		if(sn3 >= 1000)
		{
			System.out.println("\nO quadrado do terceiro n�mero �: "+sn3);
		}
		else
		{
			System.out.println("\nO primeiro n�mero �: "+n1+". O quadrado dele �: "+sn1);	
			System.out.println("\nO primeiro n�mero �: "+n2+". O quadrado dele �: "+sn2);	
			System.out.println("\nO primeiro n�mero �: "+n3+". O quadrado dele �: "+sn3);	
			System.out.println("\nO primeiro n�mero �: "+n4+". O quadrado dele �: "+sn4);	
		}		
		
			
	}

}
