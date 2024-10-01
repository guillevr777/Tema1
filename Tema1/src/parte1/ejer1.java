package parte1;

import java.util.Scanner;

public class ejer1 {
	
	public static void main(String[] args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//variable para almacenar numero
		int number;
		//pedimos numero al usuario
		System.out.println("introduzca un numero");
		//lee el numero en consola 
		number = reader.nextInt();
		//da el numero que dimos
		System.out.print("Has elegido " + number + " como numero.");
		//se cierra el escaner
		reader.close();
	}
}