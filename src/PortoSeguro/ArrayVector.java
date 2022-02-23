package PortoSeguro;

import java.util.Scanner;

public class ArrayVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Class 4 - 11/02/22 - Vetor e matriz
		
		float[]media = new float[5];
		float n1,n2,n3,somaMedia = 0, mediaGeral=0;
		String[] nomeAlune = new String[5];
		int aprovad=0,reprovad=0,exame=0,x=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for(x=0;x>6;x++);
		{
			System.out.println("\nNotas do alune: "+(x+1)+nomeAlune);
			System.out.println("\nEntre com a primeira nota: ");
			n1 = leia.nextFloat();
			while(n1<0 || n1>10)
			{
				System.out.println("\nTente um valor entre 0 e 10 e separe os decimais com uma vírgula.\nEntre com a primeira nota: ");
				n1 = leia.nextFloat();
			}
			System.out.println("\nEntre com a segunda nota: ");
			n2 = leia.nextFloat();
			while(n2<0 || n2>10)
			{
				System.out.println("\nTente um valor entre 0 e 10 e separe os decimais com uma vírgula.\nEntre com a segunda nota: ");
				n2 = leia.nextFloat();
			}
			System.out.println("\nEntre com a terceira nota: ");
			n3 = leia.nextFloat();
			while(n3<0 || n3>10)
			{
				System.out.println("\nTente um valor entre 0 e 10 e separe os decimais com uma vírgula.\nEntre com a terceira nota: ");
				n3 = leia.nextFloat();
			}

			media[x] = (n1+n2+n3) / 3 ;
				
			somaMedia += media[x];
						
			System.out.println("\nAlune: "+nomeAlune+"Média: "+media[x]);
			
			if(media[x]>=7 && media[x]<=10)
			{
				System.out.println("\nAlune aprovade! =)");
				aprovad++;
			}
			else if(media[x]>=5 && media[x]<=7)
			{
				System.out.println("\nAlune de exame. :/");
				exame++;
			}
			else
			{	
				System.out.println("\nAlune reprovado. :(");
				reprovad++;
			}
			
			
		
		
		}
		
		
	}

}
