package edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio_14 {
	
	public static final double ESTATURA_MINIMA = 1.5;
	public static final double EDAD_MINIMA = 7;
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {

		Boolean acceso;
		int edad1;
		float estatura1;
		String nombre1;
		
		System.out.println("Ingrese el nombre");
		nombre1 = input.nextLine();		
		
		System.out.println("Ingrese la edad");
		edad1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la altura en metros");
		estatura1 = Float.parseFloat(input.nextLine());
		
		acceso = edad1 >= EDAD_MINIMA && estatura1 > ESTATURA_MINIMA; 		
		System.out.println(nombre1 + " - " + edad1 + " años - " + estatura1 + " metros. ¿Entra al juego? " + acceso);
		
		
		
	
		

			

	}

}
