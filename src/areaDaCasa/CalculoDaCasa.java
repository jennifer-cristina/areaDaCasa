package areaDaCasa;

import java.util.Scanner;

public class CalculoDaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		String comodo, solicitacao = "S";
		int largura, comprimento, metrosQuadrados;
		 
		
		System.out.println("-------------------------------------");
		System.out.println("  Calculo de �rea de uma casa ");
		System.out.println("-------------------------------------");
		
		System.out.print("Iniciar o calculo? ");
		solicitacao = leitor.next();
		System.out.println();
		
		int AreaTotal = 0;
		
		if ( solicitacao.equals("Sim") || solicitacao.equals("sim") || solicitacao.equals("s") ) {
			while ( solicitacao.equals("S") || solicitacao.equals("sim") || solicitacao.equals("s") ) {
		
				System.out.print(" Qual o nome do c�modo? ");
				comodo = leitor.next();
				
				System.out.print(" Qual a largura? ");
				largura = leitor.nextInt();
				
				System.out.print(" Qual o comprimento? ");
				comprimento = leitor.nextInt();
				
				metrosQuadrados = largura * comprimento; 
				System.out.print(" A sala tem " + metrosQuadrados + " metros quadrados.");
				
				System.out.println();
				System.out.println();
				
				System.out.print("Voc� deseja calcular mais c�modos (S/N)? ");
				solicitacao = leitor.next();
			
				AreaTotal = metrosQuadrados + AreaTotal;
				
				} 
				leitor.close();
				System.out.println("A �rea total da casa � " + AreaTotal + " metros quadrados.");
		} else {
			System.out.println(" Inv�lido. Por favor digite S/N");
		}
	}
}
