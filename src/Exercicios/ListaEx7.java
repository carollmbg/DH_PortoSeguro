package Exercicios;

import java.util.Scanner;

public class ListaEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

/*7) Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores
que zero). Em caso afirmativo, calcular a área do triângulo.
*/
		
	double base=0,altura=0,area=0;	
		
	Scanner leia = new Scanner(System.in);
	   
		
    System.out.println("\nDigite a base do triangulo em m2: ");
	base = leia.nextFloat();
	while(base<0)
	{	
		System.out.println("\nDigite a base do triangulo novamente em m2, deve ser um numero positivo. ");
		base = leia.nextFloat();
	}
	System.out.println("\nDigite a altura do triangulo em m2: ");
    altura = leia.nextFloat();
	while(altura<0)
	{
		System.out.println("\nDigite a altura do triangulo novamente em m2, deve ser um numero positivo. ");
	    altura = leia.nextFloat();
	}
	
	area = (base * altura) / 2;
	System.out.println("\nA area do triangulo é "+area+" m2. ");
	
	}

	}


