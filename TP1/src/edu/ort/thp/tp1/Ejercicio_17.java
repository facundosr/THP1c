package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_17 {

	public static final int EDAD_F = 60;
	public static final int EDAD_M = 65;
	public static final int EDAD_MIN = 1;
	public static final int EDAD_MAX = 120;

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int edad;
		char gen;
		String mensErr = "";
		String jub = "NEGATIVO";

		System.out.println("Ingrese una edad entre 1 y 120 años");
		edad = Integer.parseInt(input.nextLine());

		if (edad >= EDAD_MIN && edad <= EDAD_MAX) {
			System.out.println("Ingrese un género 'F' para mujer y 'M' para hombre");
			gen = input.nextLine().toUpperCase().charAt(0);
			
			if (gen == 'M') {

				if (edad >= EDAD_M) {
					jub = "AFIRMATIVO";
				} 
				
			} else if (gen == 'F') {

				if (edad >= EDAD_F) {
					jub = "AFIRMATIVO";
				} 
			} else {
				mensErr = "Género erróneo";
			}
		} else {
			mensErr = "Edad errónea";
		}
		
		if (mensErr.equals("")) {
			System.out.println("Está en edad para jubilarse? -> " + jub);
			
		} else {
			System.out.println(mensErr);
		}

	}

}
