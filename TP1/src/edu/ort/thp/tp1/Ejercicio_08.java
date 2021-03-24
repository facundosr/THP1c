package edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio_08 {

	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {		
		
		Double resultadoSuma, resultadoResta, resultadoMulti, resultadoDiv,numero1, numero2;
		
		
		//ingresar numero1
		System.out.println("Ingrese primer número:");
		numero1 = Double.parseDouble(input.nextLine());
		
		//ingresar numero2
		System.out.println("Ingrese segundo número:");
		numero2 = Double.parseDouble(input.nextLine());

		//suma
		resultadoSuma = numero1 + numero2;		
		
		//resta
		resultadoResta = numero1 - numero2;		
		
		//division
		resultadoMulti = numero1 * numero2;
		
		//multiplicacion
		resultadoDiv = numero1 / numero2;
		
		System.out.println( numero1 + " + " + numero2 + " es igual a: " + resultadoSuma);
		System.out.println( numero1 + " - " + numero2 + " es igual a: " + resultadoResta);
		System.out.println( numero1 + " * " + numero2 + " es igual a: " + resultadoMulti);
		System.out.println( numero1 + " / " + numero2 + " es igual a: " + resultadoDiv);
		
		
		
		
		
		

	}

}
