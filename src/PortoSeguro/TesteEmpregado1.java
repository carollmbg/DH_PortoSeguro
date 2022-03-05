package PortoSeguro;

public class TesteEmpregado1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nome, endereço, cpf, telefone, idade, codigo do setor, salario e imposto
		
		Empregado1 emp = new Empregado1("Eduardo","Rua dos bobos,00","12356478912",974784569,25,123,15000,27);
		emp.imprimirInfo();
		emp.calcularSalario();
	}

}
