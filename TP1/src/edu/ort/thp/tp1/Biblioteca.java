package edu.ort.thp.tp1;

import java.util.Scanner;

public class Biblioteca {

	private static Scanner input = new Scanner(System.in);

	public static final String I = "Infantil";
	public static final String N = "Novela";
	public static final String H = "Historia";

	public static void main(String[] args) {

		char letraEstante;
		int cantLibros = 0;
		int contador = 0;
		int cantEstantes = 0;

		String nombreLibro = "";
		char genero;
		int cantPaginas = 0;
		int pagMayor = 0;
		String nombreMayor = "";
		int cantN = 0;
		int cantH = 0;
		int cantI = 0;
		double prom = 0;

		System.out.println("Ingrese la letra que identifica al estante");
		letraEstante = input.nextLine().toUpperCase().charAt(0);

		while (letraEstante != 'Z') {
			cantEstantes++;
			System.out.println("Ingrese la cantidad de libros");
			cantLibros = Integer.parseInt(input.nextLine());

			while (contador < cantLibros) {
				contador++;
				System.out.println("Ingrese el nombre del libro número " + contador);
				nombreLibro = input.nextLine();

				System.out.println("Ingrese el género");
				genero = input.nextLine().toUpperCase().charAt(0);

				System.out.println("Ingrese la cantidad de páginas");
				cantPaginas = Integer.parseInt(input.nextLine());

				if (cantPaginas > pagMayor) {
					pagMayor = cantPaginas;
					nombreMayor = nombreLibro;
				}

				switch (genero) {
				case 'N':
					cantN++;
					break;
				case 'H':
					cantH++;
					break;
				case 'I':
					cantI++;
					break; 
				}

				
				System.out.println("El libro que más páginas tiene es " + nombreMayor + ", con una cantidad de "
						+ pagMayor + " páginas.");
				System.out.println("Ingrese la letra que identifica al estante");
				letraEstante = input.nextLine().toUpperCase().charAt(0);

			}
			contador = 0;
		}
		// salida

		if (cantEstantes > 0) {
			prom = (cantH + cantI + cantN) / cantEstantes;
			System.out.println("Cantidad de libros por género: " + "\n" + "Novela: " + cantN + "\n" + "Historia: "
					+ cantH + "\n" + "Infantil: " + cantI);
			System.out.println("El promedio de libros por estantes es: " + prom);

		} else {
			System.out.println("Hasta la próxima");

		}

	}
}
