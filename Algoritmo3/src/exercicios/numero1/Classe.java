/*
 * 
 * Um cliente quer que vocês gerem um cardápio para eles.
	O cardápio terá os seguintes itens:
		Pizza de calabresa
		Pizza de 4 queijos
		Pizza de frango
		Pizza de lombinho
		Pizza de coração
		Pizza de carne
		Pizza de strogonoff de frango
		Pizza de strogonoff de carne
		Pizza de 5 queijos
		Pizza de banana split
		Pizza de sonho de valsa
		Pizza de prestígio
		Pizza de chocolate preto
		Pizza de chocolate branco
		Pizza de coco
		
		Deverá ser perguntado para o cliente qual é o valor de cada item do cardápio e
		imprimir no final o cardápio por completo com todos os itens e seus respectivos valores.		
		Agora simule um pedido ao um garçom. Ou seja, com os valores agora		
		armazenados pergunte a um cliente o que ele deseja:		
		Somente uma pizza será solicitada ao cliente:		
		Ou seja, o programa irá perguntar para o cliente que pizza ele quer, e o sistema irá
		
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
		pizzas[4][0] = "coração";
		pizzas[5][0] = "carne";
		pizzas[6][0] = "strogonoff de frango";
		pizzas[7][0] = "strogonoff de carne";
		pizzas[8][0] = "5 queijos";
		pizzas[9][0] = "banana split";
		pizzas[10][0] = "sonho de valsa";
		pizzas[11][0] = "prestígio";
		pizzas[12][0] = "chocolate preto";
		pizzas[13][0] = "chocolate branco";
		pizzas[14][0] = "coco";
		
		
		for (int aux = 0 ; aux < pizzas.length; aux++) {
			System.out.println("Informe o valor da pizza " + pizzas[aux][0]);
			pizzas[aux][1] = scanner.nextLine();
			
		}
		
		for ( int aux = 0; aux < pizzas.length; aux++ ){
			System.out.println("Código: "+ aux +" Sabor: "+ pizzas[aux][0] + " Valor : R$" + pizzas[aux][1]);
		}
		
		System.out.println("Digite o código do sabor desejado.");
		codigoPizza = Integer.parseInt(scanner.nextLine());
		scanner.close();
				
		System.out.println("Código: "+ codigoPizza +" Sabor: "+ pizzas[codigoPizza][0] + " Valor : R$" + pizzas[codigoPizza][1]);
		
		
		
	}
}
