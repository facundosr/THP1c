package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_30 {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2;
		char op;
		double resul = 0;
		String msj = "";
		
		
		System.out.println("Ingrese la operación que desea realizar '+' '-' '*' '/' o 'F' para cancelar");
		op = input.nextLine().toUpperCase().charAt(0);	
		
		
		while (op != 'F') {
			
resul = 0;
			
			System.out.println("Ingrese el primer número");
			num1 =  Integer.parseInt(input.nextLine());
			
			System.out.println("Ingrese el segundo número");
			num2 =  Integer.parseInt(input.nextLine());		
			
			
			switch (op) {
				case '+':
					resul = num1 + num2;
					break;
				case '-':
					resul = num1 - num2;
					break;
				case '*':
					resul = num1 * num2;
					break;
				case '/':
					
					if (num2 == 0) {
						msj = "Error, No se puede dividir por 0";
					} else {
						resul = num1 / num2;
					}
					break;
				default:
					System.out.println("Operador incorrecto, ingrese '+' '-' '*' '/' ");
					break;	

				
			}

				if	(msj.equals("")) {
					System.out.println(resul);
				} else {
					System.out.println(msj);

				}
				
			
				System.out.println("Ingrese la operación que desea realizar '+' '-' '*' '/' o 'F' para cancelar");
				op = input.nextLine().toUpperCase().charAt(0);		
			
		}
			
		System.out.println("Cerrando calculadora...");

		
	}

}
