package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_34 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double altura;
		double sumAlturas = 0;
		int contador = 0;
		double promedio = 0;

		System.out.println("Ingrese la altura del jugador o [0] para salir");
		altura = Double.parseDouble(input.nextLine());

		while (altura != 0) {
			sumAlturas += altura;
			contador++;

			System.out.println("Ingrese la altura del jugador o [0] para salir");
			altura = Double.parseDouble(input.nextLine());
		}

		if (sumAlturas == 0) {
			System.out.println("No hubo jugadores ingresados");
		} else {
			promedio = sumAlturas / contador;
			System.out.println("Se ingresaron " + contador + " jugadores y la altura promedio es " + promedio + " m.");
		}
	}

}
