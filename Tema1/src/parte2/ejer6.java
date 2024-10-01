package parte2;

import java.util.Scanner;

public class ejer6 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		double mili;
		double centi;
		double metro;
		double resultado;
		//Pedimos valor a
		System.out.println("Di los milimetros");
		mili = reader.nextDouble();
		//Pedimos valor a
		System.out.println("Di los centimetros");
		centi = reader.nextDouble();
		//Pedimos valor a
		System.out.println("Di los metros");
		metro = reader.nextDouble();
		//hacemos la operacion
		resultado = centi + mili/10 + metro*100;
		//mostramos el resultado
		System.out.println("Sera un total de " + resultado + " centimetros.");
		//cerramos el escaner
		reader.close();
	}
}
