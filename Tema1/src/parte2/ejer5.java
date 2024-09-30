package parte2;

import java.util.Scanner;

public class ejer5 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		int segundos;
		int segun2;
		int minutos;
		int horas;
		//Pedimos valor a
		System.out.println("Introduce una cantidad de segundos");
		segundos = reader.nextInt();
		//hacemos la operacion
		horas = segundos/3600;
		minutos = segundos/60 - horas*60;
		segun2 = segundos%60 ;
		//mostramos el resultado
		System.out.println("son " + segun2 + " : " + minutos + " : " + horas);
		//cerramos el escaner
		reader.close();
	}
}
