package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_31_DoWhile {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		char resp;

		do {
			System.out.println("¿Desea continuar operando? [S/N]");
			resp = input.nextLine().toUpperCase().charAt(0);
		} while (resp != 'S' && resp != 'N');

		System.out.println("Respuesta aceptada");

	}

}
