package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_19 {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int numero;
		boolean esDeUnSoloDigito;
		boolean esImpar;
		boolean estaEnAmbos;
		boolean noEstaEnNinguno;
		
		
		
		System.out.println("Ingrese un número entero");
		numero = Integer.parseInt(input.nextLine());
		
		esDeUnSoloDigito = numero > -10 && numero < 10;
		esImpar = numero % 2 !=0;
		estaEnAmbos = esDeUnSoloDigito && esImpar;
		noEstaEnNinguno = !estaEnAmbos;
		
		System.out.println("Es de un solo dígito " + esDeUnSoloDigito);
		System.out.println("Es impar " + esImpar);
		System.out.println("Está en ambos " + estaEnAmbos);
		System.out.println("No esta en ninguno " + noEstaEnNinguno);

		


		
		
		
	}

}
