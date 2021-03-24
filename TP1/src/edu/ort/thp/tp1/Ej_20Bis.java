package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ej_20Bis {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int numDia;
		String dia = "";
		String mensErr = "";

		System.out.println("Ingrese un número del 1 al 7");
		numDia = Integer.parseInt(input.nextLine());

		switch (numDia) {

		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Lunes";
			break;
		case 3:
			dia = "Martes";
			break;
		case 4:
			dia = "Miércoles";
			break;
		case 5:
			dia = "Jueves";
			break;
		case 6:
			dia = "Viernes";
			break;
		case 7:
			dia = "Sábado";
			break;
		default:
			mensErr = "entrada inválida";
		}
		
		
		if ( mensErr.equals("entrada inválida") ) {
			System.out.println( mensErr );
		} else {
			System.out.println( "El día de la semana es " + dia );

		}
		
		
			

	}

}