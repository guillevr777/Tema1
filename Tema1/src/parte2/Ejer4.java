package parte2;

import java.util.Scanner;

public class Ejer4 {
	public static void main(String[]args) {
		//operacion a realizar
		//y=ax2+bx+c
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		double a;
		double b;
		double c;
		double x;
		double y;
		//Pedimos valor a
		System.out.println("Introduce el primer coeficiente");
		a = reader.nextDouble();
		//Pedimos valor b
		System.out.println("Introduce el siguiente");
		b = reader.nextDouble();
		//Pedimos valor c
		System.out.println("Introduce el siguiente");
		c = reader.nextDouble();
		//Pedimos valor x
		System.out.println("Introduce el valor de x");
		x = reader.nextDouble();
		//hacemos la operacion
		y = ((a*(x*x)) + b*x) + c;
		//mostramos el resultado
		System.out.println("Y valdra = " + y);
		//cerramos el escaner
		reader.close();
	}
}
