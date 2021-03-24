package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_10 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		double capitalSocio1;
		double capitalSocio2;
		double capitalSocio3;
		String socio1;
		String socio2;
		String socio3;
		double capitalAcumulado = 0;

		
		//Ingreso nombre y capital del socio1		
		System.out.println("Ingrese nombre socio 1");
		socio1 = input.nextLine();
		System.out.println("Ingrese el capital aportado del socio 1");
		capitalSocio1 = Double.parseDouble(input.nextLine());
		capitalAcumulado += capitalSocio1;
		
		//Socio 2
		System.out.println("Ahora ingrese nombre del socio 2");
		socio2 = input.nextLine();
		System.out.println("Ahora ingrese el capital del socio 2");
		capitalSocio2 = Double.parseDouble(input.nextLine());
		capitalAcumulado += capitalSocio2;

		
		//Socio3
		System.out.println("Por ultimo ingrese nombre del socio 3");
		socio3 = input.nextLine();
		System.out.println("Ahora ingrese el capital del socio 3");
		capitalSocio3 = Double.parseDouble(input.nextLine());
		capitalAcumulado += capitalSocio3;
		
		System.out.println("Capital aportado por " + socio1 + " es " + capitalSocio1 * 100 / capitalAcumulado + "%");
		System.out.println("Capital aportado por " + socio2 + " es " + capitalSocio2 * 100 / capitalAcumulado + "%");
		System.out.println("Capital aportado por " + socio3 + " es " + capitalSocio3 * 100 / capitalAcumulado + "%");


		input.close();
		
		
		
	}

}
