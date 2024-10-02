package parte1;

import java.util.Scanner;

public class Ejer11 {
	
	public static void main(String[]args) {
		//presentamos las variables
		int peseta = 166;
		double euro ;
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//le ponemos al usuario que diga una cantidad de pesetas
		System.out.println("Dime una cantidad de pesetas");
		//lee las pesetas
		peseta = reader.nextInt();
		//convierte las pesetas a euros
		euro = (double) peseta / 166;
		//dice cuanto es la conversion
		System.out.println(peseta + " pstas = " + euro + " euros");	
		//cerramos el escaner
		reader.close();
	}
}