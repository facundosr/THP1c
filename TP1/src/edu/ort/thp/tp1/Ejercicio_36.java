package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_36 {

	public static final int PAQ_1 = 1;
	public static final int PAQ_2 = 2;
	public static final int PAQ_3 = 3;
	public static final int PAQ_4 = 4;
	public static final int PAQ_0 = 0;

	public static final String NOMBRE_DESTINO_1 = "Brasil";
	public static final String NOMBRE_DESTINO_2 = "Caribe";
	public static final String NOMBRE_DESTINO_3 = "Disney";
	public static final String NOMBRE_DESTINO_4 = "Europa";
	public static final String PAQUETE_PROMOCION = "Disney";

	public static final double PRECIO_POR_PASAJERO_1 = 6000.00;
	public static final double PRECIO_POR_PASAJERO_2 = 15000.00;
	public static final double PRECIO_POR_PASAJERO_3 = 35000.00;
	public static final double PRECIO_POR_PASAJERO_4 = 70000.00;

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int numPaq;
		String nombreCliente;
		int cantPasajeros = 0;
		double precioPaqElegido = 0;
		int contPaq = 0;
		double totalRec = 0;
		double precioPaquete;
		double paqMayorMonto = 0; 
		int cantPasajerosTotal = 0;
		String nombreDestino = "";
		String destMayorMonto = "";
		String nombPaqMayorMonto = "";
		double montoTotal = 0;

		System.out.println("Bienvenido!");
		System.out.println();
		System.out.println();

		System.out.println("*** Destinos y precios ***");
		System.out.println();
		
		
		System.out.println("1 -" + NOMBRE_DESTINO_1 + "($" + PRECIO_POR_PASAJERO_1 + ")\n"
				+ "2 - " + NOMBRE_DESTINO_2 + "($" + PRECIO_POR_PASAJERO_2 + ")\n"
				+ "3 - " + NOMBRE_DESTINO_3 + "($" + PRECIO_POR_PASAJERO_3 + ")\n"
				+ "4 - " + NOMBRE_DESTINO_4 + "($" + PRECIO_POR_PASAJERO_4 + ")\n"
				+ "0 - " + "TERMINAR CARGA");
		;

		System.out.println("Atención precio promocional a " + PAQUETE_PROMOCION);

		System.out.print("Elija el paquete que desea adquirir o [0] para terminar la carga: ");
		numPaq = Integer.parseInt(input.nextLine());

		while (numPaq < 0 || numPaq > 4) {
			System.out.print("Error, ingrese un número de paquete entre válido o [0] para Terminar Carga: ");
			numPaq = Integer.parseInt(input.nextLine());
		}

		while (numPaq != 0) {

			System.out.print("Ingrese el nombre del Cliente: ");
			nombreCliente = input.nextLine();
			System.out.print("Ingrese la cantidad de pasajeros: ");
			cantPasajeros = Integer.parseInt(input.nextLine());

			switch (numPaq) {
			case 1:
				System.out.println("Destino del paquete: " + NOMBRE_DESTINO_1);
				precioPaqElegido = PRECIO_POR_PASAJERO_1;
				nombreDestino = NOMBRE_DESTINO_1;
				break;
			case 2:
				System.out.println("Destino del paquete: " + NOMBRE_DESTINO_2);
				precioPaqElegido = PRECIO_POR_PASAJERO_2;
				nombreDestino = NOMBRE_DESTINO_2;
				break;
			case 3:
				System.out.println("Destino del paquete: " + NOMBRE_DESTINO_3);
				precioPaqElegido = PRECIO_POR_PASAJERO_3;
				nombreDestino = NOMBRE_DESTINO_3;
				break;
			case 4:
				System.out.println("Destino del paquete: " + NOMBRE_DESTINO_4);
				precioPaqElegido = PRECIO_POR_PASAJERO_3;
				nombreDestino = NOMBRE_DESTINO_4;
				break;

			}
			precioPaquete = cantPasajeros * precioPaqElegido;

			System.out.println("Monto total del paquete: $" + precioPaquete);

			// CALCULOS FINAL
			// CONTADO PAQUETES
			contPaq += 1;

			// TOTAL RECAUDADO
			totalRec = totalRec + precioPaquete;

			// PAQUETE DE MONTO MAYOR
			if (precioPaquete > paqMayorMonto) {
				paqMayorMonto = precioPaquete;
				destMayorMonto = nombreDestino;
				nombPaqMayorMonto = nombreCliente;
			}

			// CONTADOR PASAJEROS
			cantPasajerosTotal += cantPasajeros;


			System.out.println();
			System.out.println("********************");
			System.out.println();

			System.out.println("Bienvenido!");
			System.out.println();
			System.out.println();

			System.out.println("*** Destinos y precios ***");
			System.out.println();

			System.out.println("1 -" + NOMBRE_DESTINO_1 + "($" + PRECIO_POR_PASAJERO_1 + ")\n"
					+ "2 - " + NOMBRE_DESTINO_2 + "($" + PRECIO_POR_PASAJERO_2 + ")\n"
					+ "3 - " + NOMBRE_DESTINO_3 + "($" + PRECIO_POR_PASAJERO_3 + ")\n"
					+ "4 - " + NOMBRE_DESTINO_4 + "($" + PRECIO_POR_PASAJERO_4 + ")\n"
					+ "0 - " + "TERMINAR CARGA");
			System.out.println("Atención precio promocional a " + PAQUETE_PROMOCION);

			System.out.print("Elija el paquete que desea adquirir o [0] para terminar la carga: ");
			numPaq = Integer.parseInt(input.nextLine());

			while (numPaq < 0 || numPaq > 4) {
				System.out.print("Error, ingrese un número de paquete entre válido o [0] para Terminar Carga: ");
				numPaq = Integer.parseInt(input.nextLine());
			}

		}
		// VALIDAR
		System.out.println("");

		System.out.println("Total de Paquetes hoy: " + contPaq);
		System.out.println("Total recaudado: " + totalRec);
		System.out.println("Paquete de mayor monto: " + destMayorMonto + " por " + paqMayorMonto + " a mombre de: " + nombPaqMayorMonto);
		
		// PROMEDIO INVERTIDO POR PASAJERO
		montoTotal = totalRec / cantPasajerosTotal;
		System.out.println("Monto promedio invertido por pasajero: " + montoTotal);
		
		
		System.out.println();
		System.out.println();

		System.out.println("Hasta la próxima");
	}

}
