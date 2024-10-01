package parte2;

import java.util.Scanner;

public class ejer3 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		int num1;
		int num2;
		int resultado;
		//le preguntamos por los numerillos
		System.out.println("Di un numero joder ostia puta");
		//hacemos las operacion
		num1 = reader.nextInt();
		//le preguntamos por los numerillos
		System.out.println("Di un numero joder ostia puta");
		//hacemos las operacion
		num2 = reader.nextInt();
		//Hacemos las operaciones
		resultado = num2 -(num1%num2);
		//mostramos el resultado
		System.out.println("Tienes que sumarle " + resultado + " a " + num1 + " para que sea multiplo de " + num2);
		//cerramos el escaner
		reader.close();
	}
}
