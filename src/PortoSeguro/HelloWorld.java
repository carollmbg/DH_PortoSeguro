package PortoSeguro;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		int idade;
		float altura;
		
		Scanner leia = new Scanner(System.in); //entrada de dados
		
		System.out.println("\nHello World!!!");
		
		
		//Solicitar nome, idade e altura do usuário
		System.out.println("\nEntre com seu nome: ");
		nome = leia.nextLine(); 
		System.out.println("\nEntre com sua idade: ");
		idade = leia.nextInt();
		System.out.println("\nEntre com sua altura: ");
		altura = leia.nextFloat();
		
		//printar informações do usuário
		System.out.println("\n\tMeu nome é "+nome+"\n\teu tenho "+idade+" anos de idade \n\tE minha altura é "+altura);
		
		
		//Aula 2 Notas
		
		Float nota1,nota2,nota3;
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		
		
		
		//media = (nota1+nota2+nota3) / 3;
		
		//System.out.printf()
		
	}

}
