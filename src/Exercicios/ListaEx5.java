package Exercicios;

import java.util.Scanner;

public class ListaEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*5. A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias que s�o altamente 
	poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. Se o �ndice sobe para 0,3 as ind�strias 
	do 1� grupo s�o	intimadas a suspenderem suas atividades, se o �ndice crescer para 0,4 as industrias do 1� e 2� grupo s�o 
	intimadas a suspenderem suas atividades, se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas 
	atividades. Fa�a um sistema que	leia o �ndice de polui��o medido e emita a notifica��o adequada aos diferentes grupos de
	empresas.*/
		
		double indice;
		
		try (Scanner leia = new Scanner(System.in)) {
			
			System.out.println("\nDigite o indice de polui��o: ");
			indice = leia.nextFloat();
		}
			
		
		if(indice < 0.25)
		{
			System.out.println("\nO indice de polui��o est� dentro do aceit�vel.");
		}
		else if(indice>=0.3 && indice<0.4)
		{
			System.out.println("\nAs empresas do Grupo 1 est�o intimadas a suspenderem suas atividades.");
		}
		else if(indice>=0.4  && indice<0.5)
		{
			System.out.println("\nAs empresas do Grupo 1 e 2 est�o intimadas a suspenderem suas atividades.");
		}	
		else if(indice>=0.5)
		{
			System.out.println("\nTodas as empresas est�o intimadas a suspenderem suas atividades.");
		}
		else
		{
			System.out.println("\nSeu indice esta em uma area nebulosa.");
		}
		}
	}
		
		



