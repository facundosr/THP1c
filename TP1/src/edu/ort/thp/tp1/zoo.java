package edu.ort.thp.tp1;

import java.util.Scanner;

public class zoo {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double kilos;
		double sumKilos = 0;
		char rta;
		double totalKilos = 0;
		double kilosPorTanda = 0;
		int tandaMayorKilos = 0;
		double prom = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.println("Tanda de alimentación NRO° " + i);
			sumKilos = 0;

			do {

				System.out.println("Ingrese la cantidad de kilos consumidos");
				kilos = Double.parseDouble(input.nextLine());
				sumKilos += kilos;

				System.out.println("Quiere seguir comiendo? [S/N]");
				rta = input.nextLine().toUpperCase().charAt(0);

			} while (rta == 'S');

			totalKilos += sumKilos;

			if (sumKilos > kilosPorTanda) {
				kilosPorTanda = sumKilos;
				tandaMayorKilos = i;
			}

		}

		if (totalKilos > 0) {
			prom = totalKilos / 3;
			System.out.println("El león comió más comida en la tanda " + tandaMayorKilos + ", una cantidad de "
					+ kilosPorTanda + " kilos.");
			System.out.println("Total de kg. de alimentos recibidos fue de " + totalKilos);
			System.out.println("Promedio de alimento por tanda fue de " + prom + "kg.");
		} else {
			System.out.println("El león no se alimentó en ninguna tanda");
		}

	}

}
