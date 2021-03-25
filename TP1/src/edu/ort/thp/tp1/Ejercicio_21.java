package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_21 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int numDia;
		String dia = "";

		System.out.println("Ingrese un número del 1 al 7");
		numDia = Integer.parseInt(input.nextLine());

		switch (numDia) {

		case 1:
			dia = " El día de la semana es Domingo";
			break;
		case 2:
			dia = "El día de la semana es Lunes";
			break;
		case 3:
			dia = "El día de la semana es Martes";
			break;
		case 4:
			dia = "El día de la semana es Miércoles";
			break;
		case 5:
			dia = "El día de la semana es Jueves";
			break;
		case 6:
			dia = "El día de la semana es Viernes";
			break;
		case 7:
			dia = "El día de la semana es Sábado";
			break;
		default:
			dia = "Entrada inválida";
		}
		
		System.out.println(dia);
		
			

	}

}
