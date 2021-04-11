package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_03 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double numero;
		double multiplicacion;
		double division;

		// Ingreso de numero
		System.out.println("Ingrese un número");
		numero = Double.parseDouble(input.nextLine());

		// Multiplicacion
		multiplicacion = numero * 5;

		// División
		division = numero / 2;

		// muestro el resultado por pantalla
		System.out.println(numero + " multiplicado por 5 da: " + multiplicacion + " y dividido por 2 da: " + division);

		input.close();

	}

}
