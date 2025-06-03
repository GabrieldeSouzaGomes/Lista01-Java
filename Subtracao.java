//Subtração de Dois Números:
//Escreva um programa que solicite ao usuário dois números inteiros e exiba a diferença entre eles.
 
package lista01;

import java.util.Scanner;

public class Subtracao {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número :");
		int numero1 =sc.nextInt(); 
		System.out.println("Digite o segundo valor :"); //* *//
		int numero2 =sc.nextInt(); 
		int subtracao = numero1-numero2;
		System.out.println("A subtração dos valores digitados é : "+subtracao);
		sc.close();
		
		
}
}
