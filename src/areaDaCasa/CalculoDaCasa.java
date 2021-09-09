package areaDaCasa;

import java.util.Scanner;

public class CalculoDaCasa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		String comodo, solicitacao = "S";
		int largura, comprimento, metrosQuadrados;
		 
		
		System.out.println("-------------------------------------");
		System.out.println("  Calculo de área de uma casa ");
		System.out.println("-------------------------------------");
		
		System.out.print("Iniciar o calculo? ");
		solicitacao = leitor.next();
		System.out.println();
		
		int AreaTotal = 0;
		
		if ( solicitacao.equals("Sim") || solicitacao.equals("sim") || solicitacao.equals("s") ) {
			while ( solicitacao.equals("S") || solicitacao.equals("sim") || solicitacao.equals("s") ) {
		
				System.out.print(" Qual o nome do cômodo? ");
				comodo = leitor.next();
				
				System.out.print(" Qual a largura? ");
				largura = leitor.nextInt();
				
				System.out.print(" Qual o comprimento? ");
				comprimento = leitor.nextInt();
				
				metrosQuadrados = largura * comprimento; 
				System.out.print(" A sala tem " + metrosQuadrados + " metros quadrados.");
				
				System.out.println();
				System.out.println();
				
				System.out.print("Você deseja calcular mais cômodos (S/N)? ");
				solicitacao = leitor.next();
			
				AreaTotal = metrosQuadrados + AreaTotal;
				
				} 
				leitor.close();
				System.out.println("A área total da casa é " + AreaTotal + " metros quadrados.");
		} else {
			System.out.println(" Inválido. Por favor digite S/N");
		}
	}
}
