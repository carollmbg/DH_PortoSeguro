package Exercicios;

public class LacoRepeticao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2- Desenvolver um sistema que efetue a soma de todos os n?meros ?mpares que s?o
m?ltiplos de tr?s e que se encontram no conjunto dos n?meros de 1 at? 500.
*/
		
		
		int soma = 0;
	
		
		for(int numero=1;numero<=500;numero++)
		{
			if(numero % 3 == 0 && numero % 2 != 0)
			{
				soma = soma + numero;
			}
			
		}
		System.out.println(soma);

	}

}