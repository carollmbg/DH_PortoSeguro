package PortoSeguro;

public class Automovel {
	
	//Declara��o dos atributos da classe  Automovel
	
	 private String nomeProprietario;
	 private String modelo;
	 private String placa;
	 private int ano;
	 
	 
	 //Cria��o do m�todo especial construtor
	 
	 public Automovel(String nomeProprietario, String modelo, String placa, int ano)//cria��o de parametros
	 {
		 //Inicializa��o dos atributos para depois o objeto puxar 
		 this.nomeProprietario = nomeProprietario;
		 this.modelo = modelo;
		 this.placa = placa;
		 this.ano = ano;
	 }
	 
	 //Cria��o dos metodos da classe Automovel
	 
	/*get = metodo da classe para acessar a informa��o de um atributo
	  set = modifica o atributo, inserindo informa��o
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
	 
	
	 //cria��o de metodo, n�o esque�a da boa pr�tica de fazer uma fun��o por metodo
	
	public void imprimirInfo()
	{
		System.out.println(nomeProprietario+ " possui um(a) modelo "+modelo+" com placa "+placa+" e ano "+ano);
	}
	 

}
