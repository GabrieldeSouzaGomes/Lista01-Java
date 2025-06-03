//Cálculo da Média:
//Escreva um programa que solicite ao usuário três números inteiros e exiba a média aritmética deles.

package lista01;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da primeira nota: ");
		int nota1 = sc.nextInt();

		System.out.println("Digite o valor da segunda nota: ");
		int nota2 = sc.nextInt();

		System.out.println("Digite o valor da terceira nota: ");
		int nota3 = sc.nextInt();

		double media = (nota1 + nota2 + nota3) / 3.0;

		System.out.println("A média aritmética é: " + media);

		sc.close();
	}
}
