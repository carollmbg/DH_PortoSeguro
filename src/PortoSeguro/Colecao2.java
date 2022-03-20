package PortoSeguro;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aula 11 Estoque
		
		int op; //opção
		
		Scanner ler = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n------------------------------------------------------------");
			System.out.println("\n(1) Adicionar produtos no estoque");
			System.out.println("\n(2) Remover produtos do estoque");
			System.out.println("\n(3) Atualizar produtos do estoque");
			System.out.println("\n(4) Mostrar produtos do estoque");
			System.out.println("\n(0) Sair do programa");
			System.out.println("\n------------------------------------------------------------");
			System.out.println("\nDigite o número da opção escolhida");
			op = ler.nextInt();
			
			switch(op)
			{
				case 1:
					//Limpa o cache
					ler.nextLine();
					
					System.out.println("\nDigite o nome do produto para adicionar ao estoque");
					
					//Ler input do usuaário
					String produto = ler.nextLine();
					estoque.add(produto);
					//mostrando estado atual de estoque
					System.out.println(estoque);
				break;
				
				case 2:
					//Limpa o cache
					ler.nextLine();
					
					System.out.println("\nDigite o nome do produto para remover do estoque");
					String remover = ler.nextLine();
					if(estoque.contains(remover))
					{
						estoque.remove(remover);
						System.out.println("\nO produto "+remover+" foi removido do estoque.");
					}
					else
					{
						System.out.println("\nO produto "+remover+" não existe no estoque.");
					}
					System.out.println(estoque);
				break;
				
				case 3:
					//Limpa o cache
					ler.nextLine();
					
					System.out.println("\nDigite o nome do produto para atualizar no estoque");
					String verifica = ler.nextLine();
					System.out.println("\nDigite o nome do produto que irá substituir "+verifica+" no estoque");
					String novo = ler.nextLine();
					
					if(estoque.contains(verifica))
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else
					{
						System.out.println("\nO produto "+verifica+" não existe no estoque.");
					}
					System.out.println(estoque);
				break;
				
				case 4:
					System.out.println("\nOs produtos no estoque são: ");
					System.out.println(estoque);
					break;
					
			   default:
				   if(op == 0)
				   {
					   System.out.println("\nBye, bye. Obrigada por usar o programa! ");
				   }
				   else
				   {
					   System.out.println("\nOpção inválida! ");
				   }
		
			}
		}
		while(op != 0);

	}

}

	