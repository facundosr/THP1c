package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_12 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int num1;
		int num2;

		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese otro un numero");
		num2 = Integer.parseInt(input.nextLine());

		if (num1 > num2) {

			System.out.println("El numero " + num1 + " es mayor.");
		} else {
			System.out.println("El numero " + num2 + " es mayor.");

		}

	}

}
