package parte2;

import java.util.Scanner;

public class ejer1 {
	
	public static void main(String[]args) {
	//creamos el escaner
	Scanner reader = new Scanner(System.in);
	//Definimos las variables
	double numero;
	//le pedimos un numero al usuario
	System.out.println("Di un numero");
	//le truncamos el numero
	numero = reader.nextDouble();	
	//le decimos el numero
	System.out.println("Tu numero redondeado es " + (int) (numero + 0.5));
	//cerramos el escaner
	reader.close();
	}
}