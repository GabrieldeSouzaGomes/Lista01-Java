//Multiplicação de Dois Números:
//Escreva um programa que solicite ao usuário dois números inteiros e exiba o produto deles.
package lista01;

import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número : ");
		int numero01 = sc.nextInt();
		System.out.println("Digite um número : ");
		int numero02 = sc.nextInt();
		int resultado = numero01 * numero02;
		System.out.println("A multiplicação dos valores é :" + resultado);
		sc.close();

	}

}
