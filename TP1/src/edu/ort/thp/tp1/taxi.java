package edu.ort.thp.tp1;

import java.util.Scanner;

public class taxi {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		char distancia;
		int cantViajes = 0;
		int masGrande = 0;
		int cantPas;
		double impACobrar;
		double impFinal;
		String nombre;
		int edad;
		String nombreMasGrande = "";
		double prom = 0, recTotal = 0, porcentCorto = 0;
		int cantC = 0, cantM = 0, cantL = 0;

		do {
			System.out.println("Ingrese la distancia del viaje: ['C','M','L'] o ['Z'] para finalizar");
			distancia = input.nextLine().toUpperCase().charAt(0);

		} while (distancia != 'C' && distancia != 'M' && distancia != 'L' && distancia != 'Z');

		while (cantViajes < 30 && distancia != 'Z') {

			masGrande = 0;
			cantViajes++;

			do {
				System.out.println("Ingrese la cantidad de pasajeros");
				cantPas = Integer.parseInt(input.nextLine());

			} while (cantPas < 1 || cantPas > 4);

			System.out.println("Ingrese el importe a cobrar");
			impACobrar = Integer.parseInt(input.nextLine());

			impFinal = impACobrar + 80;

			for (int i = 0; i < cantPas; i++) {

				System.out.println("Ingrese el nombre del pasajero nro " + (i + 1));
				nombre = input.nextLine();

				do {
					System.out.println("Ingrese la edad");
					edad = Integer.parseInt(input.nextLine());

				} while (edad < 18 || edad > 120);

				if (edad > masGrande) {
					masGrande = edad;
					nombreMasGrande = nombre;
				}

			}

			System.out.println("El valor del viaje es de " + impFinal);
			System.out.println("La persona más grande tiene " + masGrande + " y se llama " + nombreMasGrande);

			switch (distancia) {
			case 'C':
				cantC++;
				break;
			case 'M':
				cantM++;
				break;
			case 'L':
				cantL++;
				break;

			}

			recTotal += impFinal;

			do {
				System.out.println("Ingrese la distancia del viaje: ['C','M','L'] o ['Z'] para finalizar");
				distancia = input.nextLine().toUpperCase().charAt(0);

			} while (distancia != 'C' && distancia != 'M' && distancia != 'L' && distancia != 'Z');

		}

		if (cantViajes >= 1) {
			prom = recTotal / cantViajes;
			porcentCorto = cantC * 100 / cantViajes; 
			System.out.println("Cantidad de viajes cortos : " + cantC);
			System.out.println("Cantidad de viajes medianos : " + cantM);
			System.out.println("Cantidad de viajes largos : " + cantL);
			System.out.println("La recaudación total fue de $" + recTotal);
			System.out.println("el promedio de valor por viaje fue de $" + prom);
			System.out.println("El porcentaje de viajes Cortos fue de " + porcentCorto + "%");
			
		} else {
			System.out.println("No se hicieron viajes");
		}
	}

}
