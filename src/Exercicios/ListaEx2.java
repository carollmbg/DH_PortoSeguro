package Exercicios;

import java.util.Scanner;

public class ListaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

/*2. Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. 
E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50 calcule o excesso de
pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. 
No final do processamento imprimir o sal�rio total e o sal�rio excedente. */
			
		
				Scanner leia = new Scanner(System.in);					

				float N=0,E,C,excedente,total;
				
				
				System.out.println("\nN�mero de horas(total)");
				C = leia.nextFloat();
							
				if(C>50)
				{	
						E = C - 50 ;
						excedente = E * 20;
						N = 50 * 10;
						total = N + excedente;
						System.out.println("\nSal�rio total: R$"+total+" Sal�rio Excedente: R$"+excedente);
				}		
				else if(C<=50)
				{	
					total = C * 10;
					System.out.println("\nSal�rio total: R$"+total);
				}

	}

}
