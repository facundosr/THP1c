package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_01 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String nombre;
		
		System.out.println("Hola, ¿Cuál es tu nombre?");
		nombre = input.nextLine();
		
		System.out.println("Hola " + nombre + ", mucho gusto." );
		

	}

}
