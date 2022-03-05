package PortoSeguro;

public class Empregado1 extends Pessoa {
	//extends só permite uma super classe como herança
	//herança da super classe Pessoa
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	
	public Empregado1(String nome, String endereco, String cpf, int telefone, int idade, 
			int codigoSetor, float salarioBase, float imposto)
	{
		super(nome,endereco,cpf,telefone,idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	
	public void calcularSalario()
	{
		double salarioLiquido = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nSalário total a ser recebido: "+salarioLiquido);
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+
		"\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()+"\nCódigo do setor: "+codigoSetor+
		"\nSalário base: "+salarioBase+"\nValor em porcentagem de imposto retido na fonte(salário)"+imposto+"%");
	}
	
}
