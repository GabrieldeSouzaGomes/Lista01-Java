
//Escreva um programa que solicite ao usuário a largura e a altura de um retângulo e exiba a área dele
package lista01;

import java.util.Scanner;

public class AriaRetangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicita os valores ao usuário
		System.out.print("Digite a largura do retângulo: ");
		double largura = scanner.nextDouble();

		System.out.print("Digite a altura do retângulo: ");
		double altura = scanner.nextDouble();

		// Calcula a área
		double area = largura * altura;

		// Exibe o resultado
		System.out.println("A área do retângulo é: " + area);

		scanner.close();
	}
}
