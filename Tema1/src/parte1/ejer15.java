package parte1;

import java.util.Scanner;

public class ejer15 {

	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//le damos valor a las variables
		double precio;
		final double iva;
		double conIva;
		//le pedimos que nos diga un precio
		System.out.println("Dime el precio del articulo");
		precio = reader.nextDouble();
		//procedemos a hacer el calculo del iva
		iva = precio * 0.21;
		conIva = iva + precio;
		//le decimos el iva que lleva el numero
		System.out.println("El precio ascendera a " + conIva + " con el iva incluido , seran " + iva + " euros mas con el iva");
		//cerramos el escaner
		reader.close();	
	}
}
