package parte1;

import java.util.Scanner;

public class Ejer10 {
	
	public static void main(String[] args) {
		
		//hacemos las variables
			
		int numero;
		boolean parimpar;
		
		//creamos el escaner
		
		Scanner reader = new Scanner(System.in);
		
		//preguntamos por la edad
		
		System.out.println("Di un numero");
		
		numero = reader.nextInt();
		
		//usamos relacionales , si la edad es supeior a 18 true sino false
		
		parimpar = numero % 2 == 0;
		
		//pone la respuesta en pantalla
		
		System.out.print(parimpar);
			
		reader.close();
		}
}
