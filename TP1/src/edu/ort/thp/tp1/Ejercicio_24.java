package edu.ort.thp.tp1;
import java.util.Scanner;
public class Ejercicio_24 {
	
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		int num1;
		int num2;
		
		System.out.println("Ingrese un número entero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro número entero mayor o igual al primero");
		num2 = Integer.parseInt(input.nextLine());
		
		while (num1 >= num2) { 
			System.out.println("vuelva a ingresar el primer número");
			num1 = Integer.parseInt(input.nextLine());
			
			System.out.println("Ingrese otro número entero, recuerde que debe ser mayor o igual al primero");
			num2 = Integer.parseInt(input.nextLine());
			
		}
		System.out.println("_******INCLUYENDOLOS*******_");

		for (int i = num1; i <= num2; i++) {
			System.out.println(i);
		}
		
		System.out.println("_******EXCLUYENDOLOS*******_");
		
		for (int i = num1+1; i < num2; i++) {
			System.out.println(i);
		}
		
			
	}

}
