package Exercicios;

import java.util.Scanner;

public class ListaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner leia = new Scanner(System.in);	
		
				
		 /*1. Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
		Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
		deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P(peso de tomates) 
		e verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o 
		dever� pagar. Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
		*/

				float P=0,E=0,M=0;
				
				System.out.println("\nEntre com o peso dos tomates em Kg: ");
				P = leia.nextFloat();
				
				if(P > 50){
					
					E = P-50;
				    M = E*4;
				    System.out.println("\nPeso: "+P+"Multa: "+M+" Excedente: "+E);
				}
				
				else if(P<50) {
					System.out.println("\nPeso: "+P+" Multa: "+M+" Excedente: "+E);
				}
				


/*2) Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. E calcule o
sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o 
na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o 
sal�rio total e o sal�rio excedente. */


				
				
				
				
				
				

		/*	3) Desenvolva um sistema em que:
			Leia 4 (quatro) n�meros;
			Calcule o quadrado de cada um;
			Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
			Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
			
			
			4) Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se este n�mero � par ou �mpar, e 
			se � positivo ou negativo.
			
			
			5) A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o altamente poluentes do
			 meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o
			  intimadas a suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o intimadas a suspenderem 
			  suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. Fa�a um sistema que
			   leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de empresas.
			   
			   
			6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
			Infantil A = 5 a 7 anos
			Infantil B = 8 a 11 anos
			Juvenil A = 12 a 13 anos
			Juvenil B = 14 a 17 anos
			Adultos = Maiores de 18 anos
			
			
			7) Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos (positivos maiores que zero). Em caso 
			afirmativo, calcular a �rea do tri�ngulo.
			
			
			8) Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma for maior que 100, caso contr�rio imprimi-la
			
			 com o valor zero.
		*/
		
		
		
		
	}
	}		
		
		


