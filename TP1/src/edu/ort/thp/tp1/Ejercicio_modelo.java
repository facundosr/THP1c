package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_modelo {

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

	public static final int FIN = 0;

	public static final double PRECIO_POR_PASAJERO_1 = 6000.00;
	public static final double PRECIO_POR_PASAJERO_2 = 15000.00;
	public static final double PRECIO_POR_PASAJERO_3 = 35000.00;
	public static final double PRECIO_POR_PASAJERO_4 = 70000.00;

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int numPaq;
		String nombreCliente;
		int cantPasajeros = 0;
		String destinoElegido = "";
		double destinoPrecio = 0;
		int totalPaquetesVendidos = 0;
		double totalRecaudado = 0;
		double montoPaquete = 0;
		double paqueteMayorMonto = 0;
		String paqueteMayorDestino = "";
		String paqueteMayorNombre = "";
		boolean numeroPaqueteIncorrecto = false;
		int cantidadTotalPasajeros = 0;
		int cantidadPaquetesPromocion = 0;
		System.out.println("Bienvenido!");
		System.out.println();
		System.out.println();

		do {
			System.out.println("*** Destinos y precios ***");
			System.out.println();

			System.out.println("1 -" + NOMBRE_DESTINO_1 + "($" + PRECIO_POR_PASAJERO_1 + ")\n" + "2 - "
					+ NOMBRE_DESTINO_2 + "($" + PRECIO_POR_PASAJERO_2 + ")\n" + "3 - " + NOMBRE_DESTINO_3 + "($"
					+ PRECIO_POR_PASAJERO_3 + ")\n" + "4 - " + NOMBRE_DESTINO_4 + "($" + PRECIO_POR_PASAJERO_4 + ")\n"
					+ "0 - " + "TERMINAR CARGA");
			System.out.println("Atención precio promocional a " + PAQUETE_PROMOCION);

			System.out.print("Elija el paquete que desea adquirir o [0] para terminar la carga: ");
			numPaq = Integer.parseInt(input.nextLine());

			switch (numPaq) {
			case 1:
				destinoElegido = NOMBRE_DESTINO_1;
				destinoPrecio = PRECIO_POR_PASAJERO_1;
				break;
			case 2:
				destinoElegido = NOMBRE_DESTINO_2;
				destinoPrecio = PRECIO_POR_PASAJERO_2;
				break;
			case 3:
				destinoElegido = NOMBRE_DESTINO_3;
				destinoPrecio = PRECIO_POR_PASAJERO_3;
				break;
			case 4:
				destinoElegido = NOMBRE_DESTINO_4;
				destinoPrecio = PRECIO_POR_PASAJERO_4;
				break;
			case FIN:
				break;
			default:
				numeroPaqueteIncorrecto = true;
				System.out.println("");
				System.out.println("Error, ingrese un número de paquete entre válido o [0] para Terminar Carga: ");
				System.out.println("");

				break;
			}

			if (!numeroPaqueteIncorrecto && numPaq != FIN) {
				do {
					System.out.print("Ingrese el nombre del Cliente: ");
					nombreCliente = input.nextLine();
				} while (nombreCliente.isEmpty());

				System.out.print("Ingrese la cantidad de pasajeros: ");
				cantPasajeros = Integer.parseInt(input.nextLine());

				while (cantPasajeros < 1) {
					System.out.println("El nro de pasajeros debe ser mayor a 1, vuelva a intentar");
					cantPasajeros = Integer.parseInt(input.nextLine());
				};
				System.out.println("");
				
				montoPaquete = cantPasajeros * destinoPrecio;
				System.out.println("Destino del paquete: " + destinoElegido);
				System.out.println("Cantidad de pasajeros: " + cantPasajeros);
				System.out.println("Monto total del Paquete : $" + montoPaquete);
				totalPaquetesVendidos++;
				totalRecaudado += montoPaquete;
				
				if(montoPaquete > paqueteMayorMonto) {
					paqueteMayorMonto = montoPaquete;
					paqueteMayorDestino = destinoElegido;
					paqueteMayorNombre = nombreCliente; 					
				}
				
				cantidadTotalPasajeros += cantPasajeros;
				
				if(destinoElegido.equals(PAQUETE_PROMOCION)) {
					cantidadPaquetesPromocion++;
				}
			}			

		} while (numPaq != FIN);
		
		if (totalPaquetesVendidos > 0) {
			System.out.println("");

			System.out.println("Total de Paquetes vendidos hoy: " + totalPaquetesVendidos +"\n"
					+ "Total recaudado: $" + totalRecaudado + "\n"
					+ "Paquete de mayor monto: " + paqueteMayorDestino + " por $" + paqueteMayorMonto +" a nombre de: " + paqueteMayorNombre + "\n"
					+ "Monto promedio invertido por pasajero: $" + totalRecaudado / cantidadTotalPasajeros + "\n"
					+ "Cantidad de paquetes vendidos a " + PAQUETE_PROMOCION + ": " + cantidadPaquetesPromocion + " (% "+ (cantidadPaquetesPromocion*100.0/totalPaquetesVendidos) +")");
			
		} else {
			System.out.println("No hubo paquetes vendidos");
		}
		
		


	}

}
