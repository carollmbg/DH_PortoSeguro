package PortoSeguro;

public class Operario extends Pessoa {
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, String cpf, int telefone, int idade, 
					double valorProducao, double comissao)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.valorProducao  = valorProducao;
		this.comissao = comissao;
	}

	public double getValorProdução() {
		return valorProducao;
	}

	public void setValorProdução(double valorProdução) {
		this.valorProducao = valorProdução;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	
	
	public void imprimirInfo()
	{
		System.out.println("\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+
		"\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()+"\nValor dos artigos produzidos: "+valorProducao+
		"\nComissão: "+comissao+"%");
	}
	
	public void calcularProducao()
	{
		double valorTotal = valorProducao + (valorProducao * (comissao /100));
		System.out.println("\nO total a ser recebido pela(o): "+getNome()+" é de: "+valorTotal);
	}
	
	
}
	