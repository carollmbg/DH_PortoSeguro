package PortoSeguro;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Maria Silva", 5000);
		lista[1] = new Empregado("Mario Quintana", 9000);
		lista[2] = new Empregado("Neil Gaiman", 15000);
		
		for(Empregado roda: lista)//da classe Empregado o for roda a lista
		{
			roda.imprimir();
		}
		
		System.out.println("\n**************************************************\n");
		
		for(Empregado roda: lista)
		{
			roda.aumentarSalario(10);
			roda.imprimir();
		}
		
		{
			
		}
	}

}
