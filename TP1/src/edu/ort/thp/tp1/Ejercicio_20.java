package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_20 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;
		double resultado = 0;
		char operador;
		boolean err = false;

		System.out.println("Ingrese el primero número");
		num1 = Integer.parseInt(input.nextLine());

		System.out.println("Ingrese el operador");
		operador = input.nextLine().charAt(0);

		System.out.println("Ingrese el segundo número");
		num2 = Integer.parseInt(input.nextLine());

		switch (operador) {
		case '+':
			resultado = num1 + num1;
			break;
		case '-':
			resultado = num1 - num1;
			break;
		case '*':
			resultado = num1 * num1;
			break;
		case '/':
			if (num2 == 0) {
				err = true;
			} else {
				resultado = num1 / num2;
			}
			break;
		default:
			System.out.println("Operador incorrecto");
		}

		if (err == false) {
			System.out.println(num1 + " " + operador + " " + num2 + " da como resultado " + resultado);
		} else {
			System.out.println("Error: No se puede dividir por 0");
		}

	}

}
