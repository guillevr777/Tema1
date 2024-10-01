package parte1;

import java.util.Scanner;

public class ejer9 {
	
		public static void main(String[] args) {
		//hacemos las variables
			
		int age;
		boolean overage = true;
		
		//creamos el escaner
		
		Scanner reader = new Scanner(System.in);
		
		//preguntamos por la edad
		
		System.out.print("Que edad tienes?");
		
		age = reader.nextInt();
		
		//usamos relacionales , si la edad es supeior a 18 true sino false
		
		overage = age>=18;
		
		//pone la respuesta en pantalla
		
		System.out.print(overage);
			
		reader.close();
		}
}
