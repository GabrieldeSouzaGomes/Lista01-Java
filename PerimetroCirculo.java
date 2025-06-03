//Cálculo de Perímetro de um Círculo
//Escreva um programa que solicite ao usuário o raio de um círculo e exiba o perímetro dele. A fórmula é: ( P = 2 \times \pi \times r ).
package lista01;

import java.util.Scanner;

public class PerimetroCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Raio: ");
		double r = sc.nextDouble();
		double p = 2 * Math.PI * r;
		System.out.println("Perímetro: " + p);
		sc.close();
	}
}
