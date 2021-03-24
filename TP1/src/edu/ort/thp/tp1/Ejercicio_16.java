package edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio_16 {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int cantAsientos;
		int cantInscriptos;
		int disponibilidad;
		
		System.out.println("Indique la cantidad de inscriptos");
		cantInscriptos = Integer.parseInt(input.nextLine());
		
		System.out.println("Indique la cantidad de asientos disponibles");
		cantAsientos = Integer.parseInt(input.nextLine());
		
	
		if (cantAsientos >= cantInscriptos) {
			System.out.println("Alcanzan los asientos");
		} else {
			disponibilidad = cantInscriptos - cantAsientos;
			System.out.println("Faltan " + disponibilidad + " asientos");
		}
		
		
		input.close();

	}

}
