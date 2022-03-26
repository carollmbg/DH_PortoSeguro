package Exercicios;

import java.util.Scanner;

public class LacoRepeticao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:

	A) média do salário da população;
	B) média do número de filhos;
	C) maior salário;
	D) percentual de pessoas com salário até R$100,00.
  */
	
		
		Scanner leia = new Scanner(System.in); //entrada de dados
		
		int[][] pesquisa = new int[20][3]; //2 dimensões, linha e coluna. 20 posições de linha, 3 posições de coluna. 
		//(inicia posição 0)
		
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
