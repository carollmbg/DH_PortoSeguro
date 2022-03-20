package PortoSeguro;

public class Excecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Aula12 exceções
		
		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		//Captura possivel exceção
		catch(NullPointerException e)
		{
			//Tratamento da exceção
			System.out.println("\nA frase inicial é nula, para solucinar isso um valor default foi atribuido.");
			frase = "Texto default";
			novaFrase = frase.toUpperCase();
		}
		System.out.println("\nFrase antiga: "+frase);
		System.out.println("\nNova frase: "+novaFrase); 

	}

}
