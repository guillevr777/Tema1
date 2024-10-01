package parte2;

import java.util.Scanner;

public class ejer8 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//Creamos las variables
		double centimetros;
		double metros;
		int resultado;
		//Pedimos numero de personas total
		System.out.println("Dime a cuantos metros ha llegado");
		metros = reader.nextDouble();
		//calculamos
		centimetros = (int) (metros*100);
		//mostramos el resultado
		System.out.println("Seran unos : " + centimetros);
		//cerramos el escaner
		reader.close();
	}
}
