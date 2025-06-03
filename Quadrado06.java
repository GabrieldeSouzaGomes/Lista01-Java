//Quadrado de um Número:
//Escreva um programa que solicite ao usuário um número inteiro e exiba o quadrado desse número.

package lista01; 

import java.util.Scanner;

public class Quadrado06 {
    public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero do Quadrado");
		int numero = sc.nextInt();
		
		int quadrado = numero*numero;
		
		System.out.println("O numero do quadrado" + numero+ " é "+ quadrado);
		sc.close();
	}

}
