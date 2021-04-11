package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_02 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double notaTrimestre1, notaTrimestre2, notaTrimestre3, promedio;

		System.out.println("Ingrese la nota del primer trimestre");
		notaTrimestre1 = Double.parseDouble(input.nextLine());

		System.out.println("Ingrese la nota del segundo trimestre");
		notaTrimestre2 = Double.parseDouble(input.nextLine());

		System.out.println("Ingrese la nota del tercer trimestre");
		notaTrimestre3 = Double.parseDouble(input.nextLine());

		promedio = (notaTrimestre1 + notaTrimestre2 + notaTrimestre3) / 3;

		System.out.println("El primedio es de: " + promedio);

		input.close();

	}

}
