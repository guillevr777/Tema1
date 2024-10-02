package parte1;

import java.util.Scanner;

public class Ejer2 {
	
	public static void main(String[] args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//pedimos numero al usuario
		System.out.println("introce tu edad");
		//lee el numero en consola 
		int edad = reader.nextInt();
		//le pedimos que sume un año
		int edadproxima = ++edad;
		//da el numero que dimos
		System.out.print("El año que viene tendras " + edadproxima +" años");
		//se cierra el escaner
		reader.close();
	}
}
