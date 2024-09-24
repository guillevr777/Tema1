package Parte1;

import java.util.Scanner;

public class ejer10 {
	
	public static void main(String[] args) {
		
		//hacemos las variables
			
		int numero;
		boolean overage;
		
		//creamos el escaner
		
		Scanner reader = new Scanner(System.in);
		
		//preguntamos por la edad
		
		System.out.println("Di un numero");
		
		numero = reader.nextInt();
		
		//usamos relacionales , si la edad es supeior a 18 true sino false
		
		overage = numero % 2 == 0;
		
		//pone la respuesta en pantalla
		
		System.out.print(overage);
			
		reader.close();
		}
}
