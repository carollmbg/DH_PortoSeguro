package Exercicios;

import java.util.Scanner;

public class ListaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

/*2. Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50 calcule o excesso de
pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. 
No final do processamento imprimir o salário total e o salário excedente. */
			
		
				Scanner leia = new Scanner(System.in);					

				float N=0,E,C,excedente,total;
				
				
				System.out.println("\nNúmero de horas(total)");
				C = leia.nextFloat();
							
				if(C>50)
				{	
						E = C - 50 ;
						excedente = E * 20;
						N = 50 * 10;
						total = N + excedente;
						System.out.println("\nSalário total: R$"+total+" Salário Excedente: R$"+excedente);
				}		
				else if(C<=50)
				{	
					total = C * 10;
					System.out.println("\nSalário total: R$"+total);
				}

	}

}
