package edu.ort.thp.tp1;

import java.util.Scanner;

/*Realizá un programa que a partir de un número entero cant ingresado por el usuario permita
cargar por teclado cant números enteros. La computadora debe mostrar cuál fue el mayor
número y en qué posición apareció.*/

public class Ejercicio_28 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int cant;
		int numIngresado;
		int numMayor = 0;
		int posicion = 0;

		System.out.println("Ingrese la cantidad de números que desea cargar");
		cant = input.nextInt();
		input.nextLine();

		for (int i = 1; i <= cant; i++) {
			System.out.println("Ingrese el número " + i + " de " + cant);
			numIngresado = Integer.parseInt(input.nextLine());

			if (numIngresado > numMayor) {
				numMayor = numIngresado;
				posicion = i;
			}

		}

		System.out.println("El número mayor es el: " + numMayor + ", y apareció en la posición: " + posicion);

	}

}
