package edu.ort.thp.tp1;

import java.util.Scanner;

public class Ejercicio_38 {

	private static Scanner input = new Scanner(System.in);

	private static final String USUARIO = "admin";
	private static final String PASSWORD = "123456";

	public static void main(String[] args) {

		String usuarioIngresado = "";
		String passwordIngresado = "";
		boolean entrada = false;
		int intentos = 3;

		do {
			System.out.println("Ingrese el usuario");
			usuarioIngresado = input.nextLine();
			System.out.println("Ingrese la contraseña");
			passwordIngresado = input.nextLine();

			if (USUARIO.equals(usuarioIngresado) && PASSWORD.equals(passwordIngresado)) {
				entrada = true;
			} else {
				intentos -= 1;
				System.out.println("Usuario o contraseña incorrecta, le quedan " + intentos + " intentos");
			}
		} while (entrada == false && intentos > 0);

		if (entrada == true) {
			System.out.println("Acceso condedido");
		} else {
			System.out.println("Se ha bloqueado el acceso");
		}
		input.close();
	}

}
