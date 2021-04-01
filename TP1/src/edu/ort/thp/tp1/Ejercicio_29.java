package edu.ort.thp.tp1;

import java.util.Scanner;

/*Realizá un programa que permita validar la nota de un examen. Se espera que la nota que el
usuario ingrese sea un número comprendido entre 0 y 10. La misma debe ser ingresada
tantas veces como sea necesario hasta que quede comprendida dentro del rango indicado.
[EC]*/

public class Ejercicio_29 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int nota;		
		
		/*
		do {
			System.out.println("Ingrese una nota entre 0 y 10");
			nota = Integer.parseInt(input.nextLine());
			
		} while (nota < 0 || nota > 10);
		
		*/
		
		
		System.out.println("Ingrese una nota entre 0 y 10");
		nota = Integer.parseInt(input.nextLine());

		while (nota < 0 || nota > 10) {

			System.out.println("Error, la nota debe ser entre 0 y 10");
			nota = Integer.parseInt(input.nextLine());

		}

	}

}
