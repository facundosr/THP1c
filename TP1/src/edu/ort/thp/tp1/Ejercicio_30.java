package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_30 {
	
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2;
		char op;
		double resul = 0;
		String msj = "";
		
		System.out.println("¿Quiere realizar alguna operación?");
		
		
		
		System.out.println("Ingrese el primer número");
		num1 =  Integer.parseInt(input.nextLine());
		
		System.out.println("Ahora ingrese el operador '+' '-' '*' '/'");
		op = input.nextLine().charAt(0);
				
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
					System.out.println("Error, No se puede dividir por 0");
				} else {
					resul = num1 / num2;
				}
				break;
			default:
				System.out.println("Operador incorrecto, ingrese '+' '-' '*' '/' ");
				break;	
			case 'F':
				msj = "Hasta Luego"
				;
				break;
			
		}

			if	(msj.equals("")) {
				System.out.println(resul);
			} else {
				System.out.println(msj);

			}
		
	}

}
