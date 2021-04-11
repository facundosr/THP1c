package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_25 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int ancho, alto;

		do {
			System.out.println("Ingrese ancho y alto, deben ser mayores que 0");
			ancho = Integer.parseInt(input.nextLine());
			alto = Integer.parseInt(input.nextLine());
		} while (ancho < 1 || alto < 1);

		for (int i = 0; i < alto; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("X");
			}
			System.out.println((""));
		}

	}

}
