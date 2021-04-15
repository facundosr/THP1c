package edu.ort.thp.tp1;

import java.util.Scanner;

public class FastFood {

	private static Scanner input = new Scanner(System.in);

	public static final String OP_1 = "Combo";
	public static final String OP_2 = "Hamburguesa sola";
	public static final String OP_3 = "Hamburguesa con queso";
	public static final String OP_4 = "Gaseosa";
	public static final String OP_5 = "Postre";
	public static final String OP_6 = "Pagar compra";
	public static final String OP_7 = "Cancelar compra";

	public static final double PRECIO_1 = 550;
	public static final double PRECIO_2 = 300;
	public static final double PRECIO_3 = 330;
	public static final double PRECIO_4 = 150;
	public static final double PRECIO_5 = 100;

	public static final double PRECIO_MIN = 550;

	public static void main(String[] args) {

		int opcion;
		double montoPedido = 0;
		boolean pagar = false;
		boolean fin = false;
		int cantidad;
		double valorOpcion = 0;
		boolean pedirCantidad = false;

		do {
			System.out.println("Elija una de las opciones: ");
			System.out.println("");
			System.out.println("1 - " + OP_1 + " $ " + PRECIO_1 + "\n" + "2 - " + OP_2 + " $ " + PRECIO_2 + "\n"
					+ "3 - " + OP_3 + " $ " + PRECIO_3 + "\n" + "4 - " + OP_4 + " $ " + PRECIO_4 + "\n" + "5 - " + OP_5
					+ " $ " + PRECIO_5 + "\n" + "6 - " + OP_6 + "\n" + "7 - " + OP_7);

			opcion = Integer.parseInt(input.nextLine());

			switch (opcion) {
			case 1:
				valorOpcion = PRECIO_1;
				break;
			case 2:
				valorOpcion = PRECIO_2;
				pedirCantidad = true;
				break;
			case 3:
				valorOpcion = PRECIO_3;
				pedirCantidad = true;
				break;
			case 4:
				valorOpcion = PRECIO_4;
				pedirCantidad = true;
				break; 
			case 5:
				valorOpcion = PRECIO_5;
				pedirCantidad = true;
				break;
			case 6:
				if (montoPedido < PRECIO_MIN) {
					System.out.println("Para finalizar un pedido el monto debe ser superior o igual a $ " + PRECIO_MIN);
					System.out.println("El monto actual es $ " + montoPedido);
					pedirCantidad = false;
				} else {
					pagar = true;
				}
				break;
			case 7:
				fin = true;
				break; 
			default:
				System.out.println("Ingrese una opción entre 1 y 7");
			}

			if (pedirCantidad == false && fin == false) {
				montoPedido = valorOpcion;
				System.out.println("\n" + "Subtotal: $ " + montoPedido + "\n" + "Desea agregar algo más?");

			} else if (pedirCantidad && pagar == false) {
				System.out.print("Ingrese la cantidad que desea comprar: ");
				cantidad = Integer.parseInt(input.nextLine());

				do {
					if (cantidad <= 0) {
						System.out.println("La cantidad debe ser mayor a 0");
						System.out.print("Ingrese la cantidad que desea comprar: ");
						cantidad = Integer.parseInt(input.nextLine());

					} else {
						montoPedido += (cantidad * valorOpcion);
					}
				} while (cantidad <= 0);
				System.out.println("\n" + "Subtotal: $ " + montoPedido + "\n" + "Desea agregar algo más?");
			}
			System.out.println("");
		} while (fin == false && pagar == false);

		System.out.println("");

		if (fin) {
			System.out.println("Pedido Cancelado, hasta la próxima");
		} else {
			System.out.println("Precio del pedido $ " + montoPedido);
		}
		System.out.println();
		input.close();
	}

}
