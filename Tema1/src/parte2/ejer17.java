package parte2;

import java.util.Scanner;

public class ejer17 {
	
	public static void main(String[]args) {
	//creamos el escaner
	Scanner reader = new Scanner(System.in);
	//creamos las variables
	int numero;
	int resultado;
	int numero2;
	//le preguntamos por un numero
	System.out.println("Dime un numero");
	//recogemos el numero
	numero = reader.nextInt();
	//calculamos el resto
	numero2 = 7%numero;
	resultado = (numero2 - numero) +7 ;
	//le decimos el resultado
	System.out.println("El resto sera " + resultado);
	//cerramos el escaner
	reader.close();
	}
}
