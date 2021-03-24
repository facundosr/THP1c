package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_11 {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num;
		String salida = "impar";
		
		System.out.println("Ingrese un número");
		num = Integer.parseInt(input.nextLine());
		
		if (num % 2 == 0 ) {
			salida = "par";
		}
		
		System.out.println("El número es " + salida);
	}

}
