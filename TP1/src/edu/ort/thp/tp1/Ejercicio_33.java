package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_33 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double num = 0;
		double numMayor = 0;
		double numMenor = 0;

		
		System.out.println("Ingrese un número o [0] para salir");
		num = Integer.parseInt(input.nextLine());
		
		while (num != 0) {
			
			if (numMayor == 0 && numMenor == 0) {
				numMayor = num;
				numMenor = num;

			} else if (num > numMayor) {
				numMayor = num;
			} else {
				numMenor = num;
			}
			System.out.println("Ingrese otro número o [0] para salir");
			num = Integer.parseInt(input.nextLine());

		}
		
		if (numMayor == 0) {
			System.out.println("No se han ingresado números");
		} else {
			System.out.println("El mayor es " + numMayor + " y el menor es " + numMenor);
		}

	}

};
