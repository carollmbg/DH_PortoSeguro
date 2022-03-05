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

	public double getValorProdu��o() {
		return valorProducao;
	}

	public void setValorProdu��o(double valorProdu��o) {
		this.valorProducao = valorProdu��o;
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
		"\nTelefone: "+getTelefone()+"\nEndere�o: "+getEndereco()+"\nValor dos artigos produzidos: "+valorProducao+
		"\nComiss�o: "+comissao+"%");
	}
	
	public void calcularProducao()
	{
		double valorTotal = valorProducao + (valorProducao * (comissao /100));
		System.out.println("\nO total a ser recebido pela(o): "+getNome()+" � de: "+valorTotal);
	}
	
	
}
	