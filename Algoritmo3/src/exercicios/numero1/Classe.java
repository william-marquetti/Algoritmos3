/*
 * 
 * Um cliente quer que voc�s gerem um card�pio para eles.
	O card�pio ter� os seguintes itens:
		Pizza de calabresa
		Pizza de 4 queijos
		Pizza de frango
		Pizza de lombinho
		Pizza de cora��o
		Pizza de carne
		Pizza de strogonoff de frango
		Pizza de strogonoff de carne
		Pizza de 5 queijos
		Pizza de banana split
		Pizza de sonho de valsa
		Pizza de prest�gio
		Pizza de chocolate preto
		Pizza de chocolate branco
		Pizza de coco
		
		Dever� ser perguntado para o cliente qual � o valor de cada item do card�pio e
		imprimir no final o card�pio por completo com todos os itens e seus respectivos valores.		
		Agora simule um pedido ao um gar�om. Ou seja, com os valores agora		
		armazenados pergunte a um cliente o que ele deseja:		
		Somente uma pizza ser� solicitada ao cliente:		
		Ou seja, o programa ir� perguntar para o cliente que pizza ele quer, e o sistema ir�
		
		informar o valor da mesma.
 * 
 * 
 * 
 * 
 */
package exercicios.numero1;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int codigoPizza;
		
		String[][] pizzas = new String[15][2];
		
		// pizzas [ linha ] [ sabor ] [ valor ]
		pizzas[0][0] = "calabresa";
		pizzas[1][0] = "4 queijos";
		pizzas[2][0] = "frango";
		pizzas[3][0] = "lombinho";
		pizzas[4][0] = "cora��o";
		pizzas[5][0] = "carne";
		pizzas[6][0] = "strogonoff de frango";
		pizzas[7][0] = "strogonoff de carne";
		pizzas[8][0] = "5 queijos";
		pizzas[9][0] = "banana split";
		pizzas[10][0] = "sonho de valsa";
		pizzas[11][0] = "prest�gio";
		pizzas[12][0] = "chocolate preto";
		pizzas[13][0] = "chocolate branco";
		pizzas[14][0] = "coco";
		
		
		for (int aux = 0 ; aux < pizzas.length; aux++) {
			System.out.println("Informe o valor da pizza " + pizzas[aux][0]);
			pizzas[aux][1] = scanner.nextLine();
			
		}
		
		for ( int aux = 0; aux < pizzas.length; aux++ ){
			System.out.println("C�digo: "+ aux +" Sabor: "+ pizzas[aux][0] + " Valor : R$" + pizzas[aux][1]);
		}
		
		System.out.println("Digite o c�digo do sabor desejado.");
		codigoPizza = Integer.parseInt(scanner.nextLine());
		scanner.close();
				
		System.out.println("C�digo: "+ codigoPizza +" Sabor: "+ pizzas[codigoPizza][0] + " Valor : R$" + pizzas[codigoPizza][1]);
		
		
		
	}
}
