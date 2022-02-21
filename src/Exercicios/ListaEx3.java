package Exercicios;

import java.util.Scanner;

public class ListaEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*3. Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.*/
		
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3,n4;
		double sn1,sn2,sn3,sn4;
		
		
		System.out.println("\nEntre com o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("\nEntre com o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("\nEntre com o terceiro número: ");
		n3 = leia.nextInt();
		
		System.out.println("\nEntre com o quarto número: ");
		n4 = leia.nextInt();
		
		
		sn1 = Math.sqrt(n1);
		sn2 = Math.sqrt(n2);
		sn3 = Math.sqrt(n3);
		sn4 = Math.sqrt(n4);
		
		if(sn3 >= 1000)
		{
			System.out.println("\nO quadrado do terceiro número é: "+sn3);
		}
		else
		{
			System.out.println("\nO primeiro número é: "+n1+". O quadrado dele é: "+sn1);	
			System.out.println("\nO primeiro número é: "+n2+". O quadrado dele é: "+sn2);	
			System.out.println("\nO primeiro número é: "+n3+". O quadrado dele é: "+sn3);	
			System.out.println("\nO primeiro número é: "+n4+". O quadrado dele é: "+sn4);	
		}		
		
			
	}

}
