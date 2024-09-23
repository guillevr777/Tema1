package Parte1;

import java.util.Scanner;

public class ejer2 {
	
	public static void main(String[] args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//variable para almacenar numero
		int number;
		//pedimos numero al usuario
		System.out.println("introce tu edad");
		//lee el numero en consola 
		number = reader.nextInt();
		//le pedimos que sume un año
		int a = 1;
		//da el numero que dimos
		System.out.print("El año que viene tendras " + number);
		//se cierra el escaner
		reader.close();
	}
}
