package PortoSeguro;

public class Empregado1 extends Pessoa {
	//extends s� permite uma super classe como heran�a
	//heran�a da super classe Pessoa
	
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
		System.out.println("\nSal�rio total a ser recebido: "+salarioLiquido);
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+
		"\nTelefone: "+getTelefone()+"\nEndere�o: "+getEndereco()+"\nC�digo do setor: "+codigoSetor+
		"\nSal�rio base: "+salarioBase+"\nValor em porcentagem de imposto retido na fonte(sal�rio)"+imposto+"%");
	}
	
}
