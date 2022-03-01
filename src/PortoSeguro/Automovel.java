package PortoSeguro;

public class Automovel {
	
	//Declaração dos atributos da classe  Automovel
	
	 private String nomeProprietario;
	 private String modelo;
	 private String placa;
	 private int ano;
	 
	 
	 //Criação do método especial construtor
	 
	 public Automovel(String nomeProprietario, String modelo, String placa, int ano)//criação de parametros
	 {
		 //Inicialização dos atributos para depois o objeto puxar 
		 this.nomeProprietario = nomeProprietario;
		 this.modelo = modelo;
		 this.placa = placa;
		 this.ano = ano;
	 }
	 
	 //Criação dos metodos da classe Automovel
	 
	/*get = metodo da classe para acessar a informação de um atributo
	  set = modifica o atributo, inserindo informação
	  Manipulamos os atributos atraves dos metodos*/

	public String getNomeProprietario() {
		return nomeProprietario;
	}


	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}
	 
	
	 //criação de metodo, não esqueça da boa prática de fazer uma função por metodo
	
	public void imprimirInfo()
	{
		System.out.println(nomeProprietario+ " possui um(a) modelo "+modelo+" com placa "+placa+" e ano "+ano);
	}
	 

}
