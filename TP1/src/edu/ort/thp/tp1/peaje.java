package edu.ort.thp.tp1;

import java.util.Scanner;

public class peaje {

	private static Scanner input = new Scanner(System.in);

	public static final int HORA_PICO_INICIO = 9;
	public static final int HORA_PICO_FIN = 18;
	public static final int INCREMENTO_PICO = 50;

	public static final char MOTO = 'M';
	public static final char AUTOMOVIL = 'A';
	public static final char CAMIONETA = 'C';

	public static final double COSTO_MOTO = 50;
	public static final double COSTO_AUTO = 100;
	public static final double COSTO_CAMIONETA = 150;

	public static final int HORA_DESDE = 0;
	public static final int HORA_HASTA = 23;

	public static final String FIN = "FIN";

	public static void main(String[] args) {

		String patente = "";
		char tipoVehiculo;
		int hora;
		double tarifa = 0;
		double incremento = 0;
		double recTotal = 0;
		int contMoto = 0;
		int contAuto = 0;
		int contCamioneta = 0;
		int totalVehiculos = 0;
		double porcentajeMoto = 0;

		// INGRESO PATENTE
		do {
			System.out.println("Ingresa la patente del Vehículo. (Fin para finalizar la carga)");
			patente = input.nextLine().toUpperCase();
		} while (patente.equals(""));

		while (!(patente.equals(FIN))) {
			// INGRESO EL TIPO DEL VEHICULO
			do {
				System.out.println("Ingresá tipo de vehículo (M - Moto, A - Automovil, C - Camioneta)");
				tipoVehiculo = input.nextLine().toUpperCase().charAt(0);
			} while (tipoVehiculo != MOTO && tipoVehiculo != AUTOMOVIL && tipoVehiculo != CAMIONETA);

			// ASIGNO LA TARIFA SEGUN EL VEHICULO INGRESADO
			switch (tipoVehiculo) {
			case MOTO:
				tarifa = COSTO_MOTO;
				contMoto++;
				break;
			case AUTOMOVIL:
				tarifa = COSTO_AUTO;
				contAuto++;
				break;
			case CAMIONETA:
				tarifa = COSTO_CAMIONETA;
				contCamioneta++;
				break;
			}
			
			// INGRESO LA HORA
			do {
				System.out.println("Ingresá la hora (solo la hora) de 0 a 23");
				hora = Integer.parseInt(input.nextLine());
			} while (hora < HORA_DESDE || hora > HORA_HASTA);

			// VALIDO SI ES HORA PICO Y ASIGNO INCREMENTO SI CORRESPONDE
			if (hora >= HORA_PICO_INICIO && hora <= HORA_PICO_FIN) {
				incremento = tarifa * INCREMENTO_PICO / 100;
				tarifa += incremento;
			}
			;

			recTotal += tarifa;

			System.out.println("El peaje del vehículo " + patente + " es $" + tarifa);

			// INGRESO NUEVAMENTE PATENTE
			do {
				System.out.println("Ingresa la patente del Vehículo. (Fin para finalizar la carga)");
				patente = input.nextLine().toUpperCase();
			} while (patente.equals(""));

		}

		if (recTotal > 0) {
			totalVehiculos = contMoto + contAuto + contCamioneta;
			porcentajeMoto = contMoto * 100 / totalVehiculos;

			System.out.println("\n" + "El porcentaje de Motos es de " + porcentajeMoto + "%" + "\n");
			System.out.println("El total recaudado es $" + recTotal);
		} else {
			System.out.println("No se ingresaron vehículos");
		}

	}

}
