package PortoSeguro;

public class TesteAutomovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da classe Automovel(pegar recursos da classe)
		
		Automovel auto = new Automovel(/*parametros*/"Maria da Silva","Camaro","A12BC34",2020);
		
		auto.imprimirInfo(); 
		
		//auto � um objeto da classe Automovel permitido a buscar oque esta l�
		
		System.out.println("\n****************************************************");
		System.out.println("\n***Transfer�ncia de Propriet�rio***");
		auto.setNomeProprietario("Emily Perini");
		System.out.println("\n****************************************************\n");
		auto.imprimirInfo(); 
		
	}

}
