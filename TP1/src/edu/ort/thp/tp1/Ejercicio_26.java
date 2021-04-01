package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_26 {

	/*
	 * Realizá un programa que permita al usuario ingresar un número natural n. La
	 * computadora debe mostrar los primeros n múltiplos de 3 excepto aquellos que
	 * sean a la vez múltiplos de 5.
	 * 
	 */
	private static Scanner input = new Scanner(System.in);
	public static final int MULTIPLO = 3;
	public static final int MULT_EXC = 5;

	public static void main(String[] args) {
		int num1;

		System.out.println("Ingrese un numero natural para mostrar la cant. de multiplos de 3");
		num1 = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= num1; i++) {

			if (i % MULT_EXC != 0) {

				System.out.println(MULTIPLO * i);
			}
		}

	}

}
