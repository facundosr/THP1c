package edu.ort.thp.tp1;

import java.util.Scanner;

/*27.Realizá un programa que permita ingresar 5 edades. Calcular y mostrar el promedio de todas
	las edades ingresadas y cuántas edades fueron valores impares mayores que 18. [EC]*/

public class Ejercicio_27 {

	private static Scanner input = new Scanner(System.in);
	public static final int CANT_EDADES = 5;

	public static void main(String[] args) {
		int sumEdades = 0;
		double edad;
		int cont = 0;
		double promedio;

		for (int i = 0; i < CANT_EDADES; i++) {

			System.out.println("Ingrese una edad");
			edad = Integer.parseInt(input.nextLine());

			sumEdades += edad;

			if (edad > 18 && edad % 2 == 1) {
				cont++;
			}
		}

		promedio = sumEdades / CANT_EDADES;

		System.out.println("El promedio de las edades es " + promedio
				+ " y la cantidad de edades impares mayores a 18 es " + cont);

	}

}
