package Exercicios;

import java.util.Scanner;

public class LacoRepeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:

	A) m�dia do sal�rio da popula��o;
	B) m�dia do n�mero de filhos;
	C) maior sal�rio;
	D) percentual de pessoas com sal�rio at� R$100,00.
  */
	
		
		Scanner leia = new Scanner(System.in); //entrada de dados
		
		int[][] pesquisa = new int[20][3]; //2 dimens�es, linha e coluna. 20 posi��es de linha, 3 posi��es de coluna. 
		//(inicia posi��o 0)
		
		 int salario[] = { 150,200,250,650,800,900,1200,10000,6000,2000,3000,1500,2500,450,500,1300,2 }; 
		 int filhos[] = {  3,5,2,3,2,2,2,0,1,2,3,2,2,0,3,0,2 }; 
		 String habitante[] = { "Ana","John","Maria","Ananda","Latifa","Bruna","Carol","Dani","Melo","Silva","Manu","Paulo","Rafa",
				 "Nina","Rene","Lina","Jessy","Tom","Jerry","Bach"}; 
	      
		 
		 for (int x = 0; x <salario.length; x++)
		 {
			 System.out.print(salario[x] + " ");
		 }
		   
		
		
				

	}

}
