package Parte1;

import java.util.Scanner;

public class ejer16 {
	
	public static void main(String[]args) {
	//creamos el escaner
	Scanner reader = new Scanner(System.in);
	//Definimos las variables
	double resultado;
	int numero;
	//le pedimos un numero al usuario
	System.out.println("Di un numero");
	//le truncamos el numero
	resultado = reader.nextDouble();
	numero = (int) resultado;
	//le decimos el numero
	System.out.println("Tu numero truncado da " + numero);
	//cerramos el escaner
	reader.close();

	}
}