package edu.ort.thp.tp1;
import java.util.Scanner;

public class Ejercicio_13 {
	
	private static Scanner input = new Scanner (System.in);
	
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int numMayor;
		
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro un numero");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro un numero");
		num3 = Integer.parseInt(input.nextLine());
		
		numMayor = num2;
		
		if (num1 > num2) {
			numMayor = num1;
		} else if (numMayor < num3) {
			numMayor = num3;
		}
		
		System.out.println(numMayor + " es el mayor");
	}

}
