package edu.ort.thp.tp1;

import java.util.Scanner;

public class autopistas {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		int condicion1 = 20;
		int condicion2 = 15;
		int condicionProm = 18;
		int diasEntre = 20; 
		int tiempo;
		int contDias = 0;
		int contCond1 = 0;
		int contCond2 = 0;
		int tiempoMenor = 0;
		int numDia;
		int prom;
		int acumTiempo = 0; 

		
		
		

		
		do {
			System.out.println("tiempo prueba");
			tiempo = Integer.parseInt(input.nextLine());
			
		}while( tiempo < 0 || tiempo > 100);
		
		
		while (tiempo !=0 && tiempo < condicion1 && contDias <= diasEntre) {
			contDias++; 
			acumTiempo += 1;
			
			if (tiempo < 20 && tiempo < 15 ) {
				contCond1++;
				contCond2++;
			}else {
				contCond1++;
			};
			
			if(tiempo < tiempoMenor) {
				tiempoMenor = tiempo;
				numDia = contDias;
				
			};
			
			
			do {
				System.out.println("tiempo prueba");
				tiempo = Integer.parseInt(input.nextLine());
				
			}while(tiempo < 0 || tiempo > 100); 
		}
		
		prom = acumTiempo / 20;
		
		if (tiempo < 20) {
			System.out.println("LALAL");
		} else {
			System.out.println("lolo"); 
		}
		
		 
		
		
		
	}
		
		
	
		 
		 


}
 