package PortoSeguro;

public class Celular extends Telefone{
	
	public Celular()
	{
		super("Telefone Celular");
		
	}
	
	@Override 
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("\nTrrrrimmmm...trrrrrriiiimmmm");
			break;
		case 2:
			System.out.println("\nPli lim lim...pli lim lim");
			break;
		default:
			System.out.println("\nAtendeeeeeeee man� gl� gl�"); //homenagem ao Moluscontos
		}
	}
		
		
		@Override
		public void disca(String numero)
		{
			System.out.println("\nO n�mero "+numero+" � um celular");
		}
		
	}


