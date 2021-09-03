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

		System.out.print(" Qual o nome do cômodo? ");
		comodo = leitor.next();
		
		System.out.print(" Qual a largura? ");
		largura = leitor.nextInt();
		
		System.out.print(" Qual o comprimento? ");
		comprimento = leitor.nextInt();
		
		metrosQuadrados = largura * comprimento; 
		System.out.print(" A sala tem " + metrosQuadrados + " metros quadrados.");
		
		System.out.println();
		System.out.println(" Você deseja calcular mais cômodos (S/N)? ");
		solicitacao = leitor.next();
		
		int contador = 0;
		
		System.out.println();
		
		while ( solicitacao.equals("S") || solicitacao.equals("s") ) {
				System.out.print(" Qual o nome do cômodo? ");
				comodo = leitor.next();
				
				System.out.print(" Qual a largura? ");
				largura = leitor.nextInt();
				
				System.out.print(" Qual o comprimento? ");
				comprimento = leitor.nextInt();
				
				metrosQuadrados = largura * comprimento; 
				System.out.print(" A sala tem " + metrosQuadrados + " metros quadrados.");
				
				System.out.println();
				
				
				System.out.println(" Você deseja calcular mais cômodos (S/N)? ");
				solicitacao = leitor.next();
				contador++;
				
				}
				
				int areaTotal = metrosQuadrados + contador;
				System.out.print("A área total da casa é " + areaTotal + "metros quadrados.");
			
		}
		
		
		

		
		
	}

