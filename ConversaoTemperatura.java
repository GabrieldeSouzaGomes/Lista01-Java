//Conversão de Temperatura:
//Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit. A fórmula é: ( F = C \times \frac{9}{5} + 32 ).
package lista01;

import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a temperatura que deseja conerveter: ");
		float temperaturaCelcius = sc.nextFloat();
		float temperaturaFahrenheit = (temperaturaCelcius * 9 / 5) + 32;
		System.out.println("A temperatura em graus Fahrenheit conervetida é : " + temperaturaFahrenheit);

		sc.close();
	}
}
