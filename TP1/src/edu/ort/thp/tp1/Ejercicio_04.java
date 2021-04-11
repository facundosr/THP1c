package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_04 {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double valorHora;
		double horasTrabajadas;
		double salarioSemanal;

		// Ingreso el valor de la hora
		System.out.println("Ingrese el valor de la hora");
		valorHora = Double.parseDouble(input.nextLine());

		// Ingreso las horas trabajadas
		System.out.println("Ingrese las horas trabajadas");
		horasTrabajadas = Double.parseDouble(input.nextLine());

		// calculo el valor del salario semanal

		salarioSemanal = (valorHora * horasTrabajadas) * 5.5;

		// muestro el salario
		System.out.println("El salario semanal es de: " + salarioSemanal);

		input.close();

	}

}
