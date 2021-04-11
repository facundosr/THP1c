package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_18 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int numero1;
		int numero2;
		int mayor;
		int menor;

		System.out.println("Ingrese dos números enteros");
		numero1 = Integer.parseInt(input.nextLine());
		numero2 = Integer.parseInt(input.nextLine());

		if (numero1 > numero2) {
			mayor = numero1;
			menor = numero2;
		} else {
			mayor = numero2;
			menor = numero1;
		}

		if (mayor % menor == 0) {
			System.out.println("Es divisible");
		} else {
			System.out.println("No es divisible");
		}

	}

}
