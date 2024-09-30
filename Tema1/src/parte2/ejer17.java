package parte2;

import java.util.Scanner;

public class ejer17 {
	
	public static void main(String[]args) {
	//creamos el escaner
	Scanner reader = new Scanner(System.in);
	//creamos las variables
	int numero;
	int resultado;
	//le preguntamos por un numero
	System.out.println("Dime un numero");
	//recogemos el numero
	numero = reader.nextInt();
	//calculamos el resto
	resultado = (7 -(numero%7)) %7;
	//le decimos el resultado
	System.out.println("El resto sera " + resultado + " , tendrias que sumarselo a tu numero para que te de 7.");
	//cerramos el escaner
	reader.close();
	}
}
