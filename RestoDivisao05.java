//Resto da Divisão:
//Escreva um programa que solicite ao usuário dois números inteiros e exiba o resto da divisão do primeiro pelo segundo

package lista01;

import java.util.Scanner;


public class RestoDivisao05 {
//ESSE PROGAMA TRAS O RESTO DA DIVISAO//
	
/*Esse comentario 
 * e multilinha	
 */
     /**
	@author gabri
	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite o primeiro valor:");
		float numero01 =sc.nextFloat();
		System.out.println("Digite um segundo valor:");
		float  numero02 =sc.nextFloat();
		float quociente = numero01%numero02;
		float resultado = numero01*numero02;
		System.out.println("O quociente é" + quociente);
		System.out.println("O resultado é "+ resultado);
		sc.close();
	}
	
}
