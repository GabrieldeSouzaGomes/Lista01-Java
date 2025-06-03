//Divisão de Dois Números:
//Escreva um programa que solicite ao usuário dois números inteiros e exiba o quociente da divisão do primeiro pelo segundo.
package lista01;

import java.util.Scanner;

public class Divisao {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primerio vslor;");
		float numero1 = sc.nextFloat();
		System.out.println("Digite um numero : ");
		float numero2 = sc.nextFloat();
		float resto = numero1 / numero2;
		System.out.println("A divisão dos valores é : " + resto);
		sc.close();
	}
}
