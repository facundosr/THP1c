package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_31 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char resp;

		System.out.println("¿Desea continuar operando? [S/N]");
		resp = input.nextLine().toUpperCase().charAt(0);

		while (resp != 'S' && resp != 'N') {
			System.out.println("Error, debe ingresar [S/N]");
			System.out.println("¿Desea continuar operando? [S/N]");
			resp = input.nextLine().toUpperCase().charAt(0);

		}

		System.out.println("Respuesta aceptada");

	}

}
