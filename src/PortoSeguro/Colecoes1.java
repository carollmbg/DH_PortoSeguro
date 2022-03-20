package PortoSeguro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.Iterator;

public class Colecoes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List
		
		
		//Cria lista
		List <Integer> minhaLista = new ArrayList<Integer>();
		
		//Adiciona elementos ao ArrayList 
		minhaLista.add(2);
		minhaLista.add(5);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(1);
		minhaLista.add(8);
		minhaLista.add(5);
		minhaLista.add(1);
		
		
		//Percorre todos os elementos
		for(Integer listaElemento:minhaLista)
		{
			System.out.println(listaElemento);
		}
		
		//Limpa cache de memória
		System.out.println();
		
		//Removendo um item da lista pelo indice
		minhaLista.remove(0);
		
		//Percorre todos os elementos
		for(Integer listaElemento:minhaLista)
		{
			System.out.println(listaElemento);
		}		
				
		//Pegar  primeiro elemento da lista
		int primeiroElemento = minhaLista.get(0);
		System.out.println("\nPrimeiro elemento da lista é: "+primeiroElemento);
		
		//Limpa cache de memória
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++)
		{
			System.out.println("\nElemento:"+minhaLista.get(i));
		}
		
		
		//Ordena lista em ordem crescente
		Collections.sort(minhaLista);
		
		System.out.println("\nLista ordenada: ");
		System.out.println(minhaLista);
		
		//Limpa cache de memória
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(6);
		meuSet.add(5);
		meuSet.add(4);
		meuSet.add(3);
		meuSet.add(2);
		meuSet.add(1);

		Iterator<Integer> iMeuSet =  meuSet.iterator();
		//iterator ordena e retira valores duplicados da lista
				
		while(iMeuSet.hasNext())
		{
			System.out.println(iMeuSet.next());
		}
		
			}

}
