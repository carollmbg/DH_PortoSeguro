package PortoSeguro;

import java.text.NumberFormat;

public class Empregado {
	
	//atributos
	
	private String nome;
	private double salario;
	
	//construtor
	
	public Empregado(String n, double s)
	{
		this.setNome(n);
		this.setSalario(s);
	}	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual)
	{
		salario *= 1 + percentual / 100;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();//coloca moeda do pais, segundo o sistema - vide documenta��o do NumberFormat para saber como especificar
		nf.setMinimumFractionDigits(2);//casas depois da virgula
		String formatoMoeda = nf.format(salario); //formata��o monetaria
		return formatoMoeda;
	}
	
	public void imprimir()
	{
		System.out.println(nome+"\t\t Sal�rio: "+this.formatarMoeda());
	}
	
}





