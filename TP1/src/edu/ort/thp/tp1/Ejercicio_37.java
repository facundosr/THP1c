package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_37 {

	private static final int CANT_SUELDOS_MAXIMA = 12;

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double sueldo = 0;
		int contador = 0;
		double sumaSueldos = 0;

		do {
			System.out.println("Ingrese el sueldo nro: " + (contador + 1));
			sueldo = Double.parseDouble(input.nextLine());

			if (sueldo > 0) {
				sumaSueldos += sueldo;
				contador++;
			}

		} while (contador < CANT_SUELDOS_MAXIMA && sueldo > 0);

		if (contador == 1) {
			System.out.println("El único sueldo ingresado es de: $" + sumaSueldos);
		} else if (contador > 1) {
			System.out.println("La suma de los " + contador + " sueldos ingresados da $" + sumaSueldos);
		} else {
			System.out.println("No se han ingresado sueldos");
		}
	}

}
