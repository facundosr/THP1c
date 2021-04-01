package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_35 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String nombre;
		String nomJoven = "";
		int edad;
		int joven = Integer.MAX_VALUE;

		System.out.println("Ingrese el nombre o [*] para salir");
		nombre = input.nextLine();

		while (!nombre.equals("*")) {
			System.out.println("Ingrese la edad");
			edad = Integer.parseInt(input.nextLine());

			if (edad < joven) {
				joven = edad;
				nomJoven = nombre;
			}

			System.out.println("Ingrese el nombre o [*] para salir");
			nombre = input.nextLine();
		}
		
		if (nomJoven.equals("")) {
			System.out.println("No hubo ingresos");

		} else {
			System.out.println("La persona más joven es " + nomJoven + " con " + joven + " años.");

		}

	}
}
