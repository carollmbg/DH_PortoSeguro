package PortoSeguro;

import java.util.Scanner;

public class Repeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tabuada
		//Class 3, 9 de fevereiro de 2022
		
		
		int tabuada,x=1,resultado=0;
		
		Scanner leia = new Scanner(System.in);
		
		//Qual tabuada meu usuário meu usuário deseja montar?
		
		
		System.out.println("\nQual tabuada você deseja montar?");
		tabuada = leia.nextInt();
				
		
		/*A diferença entre o while e o do/while é que esse executa primeiro e depois testa. 
		  Enquanto o while testa e depois executa.	*/
		
		
		do
		{
			resultado = x * tabuada;
			System.out.println("\n"+tabuada+" X "+x+" = "+resultado);
			x++;
		}
		while(x<=10);
		
	}

}
