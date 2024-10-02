package parte1;

import java.util.Scanner;

public class Ejer14 {
	public static void main(String[]args) {
		//creamos la consola
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		double primer;
		double segun;
		double tercer;
		int global;
		double total;
		//preguntamos la primera nota
		System.out.println("Mete la nota del primer trimestre");
		primer = reader.nextDouble();
		//preguntamos la segunda
		System.out.println("Mete la nota del segundo trimestre");
		segun = reader.nextDouble();
		//preguntamos la tercera
		System.out.println("Mete la nota del tercer trimestre");
		tercer = reader.nextDouble();
		//calculamos la nota entera y media del curso
		global = (int) (primer + segun + tercer) / 3;
		total = (double)(primer + segun + tercer) / 3.0;
		System.out.println("Tu nota entera seria : " + global + " y la nota decimal seria : " + total);
		//cerramos el escaner
		reader.close();
	}
}
