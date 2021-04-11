package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_09 {
	
	private static Scanner input = new Scanner(System.in);

	public static final int SUM_ANG = 180; 

	public static void main(String[] args) {

		double ang1; 
		double ang2; 

		System.out.println("Ingrese el valor de un angulo de un triangulo");
		ang1 = Double.parseDouble(input.nextLine());

		System.out.println("Ingrese el valor de un angulo de un triangulo");
		ang2 = Double.parseDouble(input.nextLine());

		System.out.println("El valor del angulo restante es de " + (SUM_ANG - ang1 - ang2) + "º");

		input.close(); 

	}

}
