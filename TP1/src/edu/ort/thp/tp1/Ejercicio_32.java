package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_32 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int nota;

		System.out.println("Ingrese una nota entre 0 y 10");
		nota = Integer.parseInt(input.nextLine());

		while ((nota >= 0 && nota <= 1) || (nota >= 3 && nota <= 4) || nota > 10) { // otra forma (nota == 0 || nota ==
																					// 1 || nota == 3 || nota ==4 ||
																					// nota > 10)

			System.out.println("Error, la nota debe ser entre 0 y 10, excepto 0-1-3-4");
			nota = Integer.parseInt(input.nextLine());

		}

		System.out.println("Nota cargada exitosamente");

	}

}
