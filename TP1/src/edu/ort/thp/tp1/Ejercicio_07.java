package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_07 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double ancho, largo, valorTotal, precioMetro, metrosAlambre;
		
		
		//ingreso del ancho
		System.out.println("Ingrese el ancho del terreno:");
		ancho = Double.parseDouble(input.nextLine());
		
		//ingreso el largo
		System.out.println("Ingrese el largo del terreno");
		largo = Double.parseDouble(input.nextLine());
		
		//ingreso el precio m2
		System.out.println("Ingrese el precio del m2: ");
		precioMetro = Double.parseDouble(input.nextLine());		
		
		//calculo el valor total
		valorTotal = (ancho*largo) * precioMetro;
		
		//calculo los metros de alambre x3
		metrosAlambre = ((ancho*2) + (largo*2)) * 3;
		
		System.out.println("Valor total del terreno: $" + valorTotal);
		System.out.println("Metros de alambre para 3 vueltas: " + metrosAlambre + " metros,");
		
		
		input.close();

		
		

	}

}
