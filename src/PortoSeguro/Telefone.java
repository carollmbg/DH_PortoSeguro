package PortoSeguro;

public abstract class Telefone {

	private String tipo;
	
	abstract public void disca(String numero);
	abstract public void toca(int numToques);//implementa��o obrigat�ria
	
	public Telefone(String tipo)
	{
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
