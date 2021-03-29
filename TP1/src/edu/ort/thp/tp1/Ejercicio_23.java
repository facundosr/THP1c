package edu.ort.thp.tp1;
import java.util.Scanner;
public class Ejercicio_23 {
	
	private static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int i;
		
		System.out.println("Ingrese un numero entero");
		num = Integer.parseInt(input.nextLine());
		
		for (i=1; i<=10; i++ ) {
			System.out.println(num*i);
		};
		
	

	}

}
