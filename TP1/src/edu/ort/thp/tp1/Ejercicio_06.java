package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_06 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static final double SUELDO_FIJO = 40000;

	public static void main(String[] args) {
		
		double totalVentas;
		double sueldoACobrar;
		
		//ingreso monto total de ventas por vendedor
		System.out.println("Ingrese el monto total de ventas del mes");
		totalVentas = Double.parseDouble(input.nextLine());
		
		//calculo el 16% y se lo sumo al sueldo fijo
				sueldoACobrar = SUELDO_FIJO + (totalVentas * 0.16);
		
		//muestro el sueldo final a cobrar
		System.out.println("El sueldo a cobrar es de: $" + sueldoACobrar);

	}

}
