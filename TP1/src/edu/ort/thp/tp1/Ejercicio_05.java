package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_05 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1;
		int num2;
		int intercambio;

		// ingreso valor 1
		System.out.println("Ingrese el valor para la variable num1");
		num1 = Integer.parseInt(input.nextLine());

		// ingreso valor 2
		System.out.println("Ingrese el valor para la variable num2");
		num2 = Integer.parseInt(input.nextLine());

		// muestro num1 y num2
		System.out.println("num1 es: " + num1 + " y num2 es: " + num2);

		// intercambio y muestro
		intercambio = num1;
		num1 = num2;
		num2 = intercambio;
		System.out.println("Ahora num1 es: " + num1 + " y num2 es: " + num2);

	}

}
