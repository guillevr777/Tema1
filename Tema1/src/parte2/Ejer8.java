package parte2;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//Creamos las variables para identificar los centimetros y metros
		double centimetros;
		double metros;
		//Pedimos numero de metros
		System.out.println("Dime a cuantos metros ha llegado");
		metros = reader.nextDouble();
		//calculamos la conversion de metros a centimetros y lo truncamos
		centimetros = (int) (metros*100);
		//mostramos el resultado
		System.out.println("Seran unos : " + centimetros);
		//cerramos el escaner
		reader.close();
	}
}
