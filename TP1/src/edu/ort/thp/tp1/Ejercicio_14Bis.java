package edu.ort.thp.tp1;

import java.util.Scanner;
public class Ejercicio_14Bis {
	
	public static final double ALTURA_MINIMA = 1.5;
	public static final double EDAD_MINIMA = 7;
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String continuar;
		int edad;
		float altura;
		String nombre;
	
		
		System.out.println("Bienvenido al verificador de estatura y edad, ¿Desea ingresar una persona? s/n");
		continuar = input.nextLine();
		
		
		
		while(continuar.equals("s")) {
			System.out.println("Ingrese el nombre");
			nombre = input.nextLine();
			
			System.out.println("Ingrese la edad");
			edad = Integer.parseInt(input.nextLine());
			
			System.out.println("Ingrese la altura");
			altura = Float.parseFloat(input.nextLine());
			
			if (edad >= EDAD_MINIMA && altura > ALTURA_MINIMA ) {
				System.out.println(nombre + " " + edad + " año/s " + altura + "m." +" ¿Entra al juego?  " + "V");
				
			} else {
				System.out.println(nombre + " " + edad + " año/s " + altura + "m." +" ¿Entra al juego?  " + "F");
			}
			
			System.out.println("Desea veririficar otra persona? s/n");
			continuar = input.nextLine();

		}
		
		System.out.println("Hasta la próxima");
					
		

	}

}
