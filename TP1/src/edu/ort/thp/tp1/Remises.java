package edu.ort.thp.tp1;

import java.util.Scanner;

public class Remises {

	private static Scanner input = new Scanner(System.in);

	public static final char LETRA_ALTA_GAMA = 'a';
	public static final char LETRA_GAMA_MEDIA = 'm';
	public static final char LETRA_ECO = 'e';

	public static final double PLUS_ALTA = 6;
	public static final double PLUS_MEDIA = 4;
	public static final double PLUS_ECO = 2;

	public static final double VALOR_ESPERA = 2;

	public static final int TRAMO_1 = 50;
	public static final int TRAMO_2 = 51;
	public static final int TRAMO_3 = 121;

	public static final double VALOR_T1 = 7;
	public static final double VALOR_T2 = 5;
	public static final double VALOR_T3 = 3;

	public static void main(String[] args) {

		String nombre = "";
		char tipoVehi;
		int cantKm;
		double valorTramo = 0;
		int minEspera = 0;
		double importeFinalViaje = 0;
		double precioViaje;
		double precioEspera = 0;
		double porcentajePlus = 0;
		double precioPlus = 0;
		double importeTotalDia = 0;
		int contViajes = 0;
		double prom = 0;
		char respuesta;

		do {
			System.out.println("S o N");
			respuesta = input.nextLine().toUpperCase().charAt(0);
		} while ( respuesta != 'S' && respuesta !='N');

		 
		
		// INGRESO EL NOMBRE
		do {
			System.out.println("Ingrese el nombre del chofer");
			nombre = input.nextLine();
		} while (nombre.equals(""));

		// INGRESO TIPO VEHICULO
		do {
			System.out.println("Ingrese el tipo de vehículo [a] Alta Gama - [m] Mediana Gama - [e] Económico)");
			tipoVehi = input.nextLine().toLowerCase().charAt(0);

		} while (tipoVehi != LETRA_ALTA_GAMA && tipoVehi != LETRA_GAMA_MEDIA && tipoVehi != LETRA_ECO);

		// ASIGNO PORCENTAJE PLUS
		switch (tipoVehi) {
		case LETRA_ALTA_GAMA:
			porcentajePlus = PLUS_ALTA;
			break;
		case LETRA_GAMA_MEDIA:
			porcentajePlus = PLUS_MEDIA;
			break;
		case LETRA_ECO:
			porcentajePlus = PLUS_ECO;
			break;

		}

		// COMIENZO DE CARGA DE VIAJES
		do {
			System.out.println("Ingrese la cantidad de km recorridos, entre [1 - 500] o [0] para terminar");
			cantKm = Integer.parseInt(input.nextLine());
		} while (cantKm < 0 || cantKm > 500);

		while (cantKm != 0) {
			// CONTADOR DE VIAJES
			contViajes++;

			// ASIGNO VALOR SEGUN TRAMO
			if (cantKm <= TRAMO_1) {
				valorTramo = VALOR_T1;
			} else if (cantKm >= TRAMO_2 && cantKm < TRAMO_3) {
				valorTramo = VALOR_T2;
			} else {
				valorTramo = VALOR_T3;
			}

			System.out.println("Ingrese los minutos de espera (entre 0 y 120)");
			minEspera = Integer.parseInt(input.nextLine());

			// PRECIO SEGUN KILOMETROS
			precioViaje = cantKm * valorTramo;
			// MONTO DE LA ESPERA
			precioEspera = minEspera * VALOR_ESPERA;
			// MONTO DEL PLUS
			precioPlus = precioViaje * (porcentajePlus / 100);
			// PRECIO FINAL
			importeFinalViaje = precioViaje + precioEspera + precioPlus;
			// SUMATORIA TODOS LOS VIAJES DEL DIA
			importeTotalDia += importeFinalViaje;

			// MUESTRO POR PANTALLA
			System.out.println("Precio kilómetros: $" + precioViaje + "\n" + "Precio espera " + minEspera
					+ " minutos: $" + precioEspera + "\n" + "Monto extra: $" + precioPlus);

			System.out.println("Monto final del viaje: $" + importeFinalViaje);

			System.out.println("");

			System.out.println("Ingrese la cantidad de km recorridos, entre [1 - 500] o [0] para terminar");
			cantKm = Integer.parseInt(input.nextLine());

		}

		// VALIDACION SI SE CARGARON VIAJES Y SALIDA FINAL
		if (contViajes > 0) {

			prom = importeTotalDia / contViajes;
			System.out.println("Chofer: " + nombre);
			System.out.println("Importe total del día: $" + importeTotalDia);
			System.out.println("Importe promedio por viajes: " + prom);
		} else {
			System.out.println("Programa cerrado");
		}

	}

}
