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
		System.out.println("\n\tMeu nome é "+nome+"\n\teu tenho "+idade+" anos de idade \n\tdE minha altura é "+altura);
		
		
		//Aula 2 Notas
		
		double nota1,nota2,nota3,media;
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		
		System.out.printf("\nMédia aritmética: %2.2,media");
		
		nota1 = Math.sqrt(nota2); //raiz quadrada
		nota2 = Math.pow(nota3, 3); //potencia
		
		
		//condições de aprovação do aluno
		
				if(media>7 && media<=10)
				{
					System.out.println("\nAluno aprovado!");
				}
				else if(media>=5 && media<7)
				{
					System.out.println("\nAluno de exame!");
				}
				else if(media>=0 && media<5)
				{
					System.out.println("\nAluno reprovado!");
				}
				else
				{
					System.out.println("\nMédia inválida!");
				}	//laço de repetição encadeado
				
		
		// x & y
		
		float x,y;
		
		System.out.println("\nEntre com o valor de X: ");
		x = leia.nextInt();
		System.out.println("\nEntre com o valor de Y: ");
		y = leia.nextInt();
		
		x = x % y; //calcula o resto da divisão entre dois inteiros
		
}
		
	}
