package parte1;

import java.util.Scanner;

public class Ejer6 {
	
	public static void main(String[] args) {
		double num1;
		double num2;
        //Creamos el escaner
        Scanner reader = new Scanner(System.in);
        //pedimos primera nota
        System.out.print("ingresa 2 numeros a continuacion");
        num1 = reader.nextInt();
        num2 = reader.nextInt();
        //Calculamos
        double num3 = num1 + num2;
        double num4 = num1 - num2;
        double num5 = num1 * num2;
        double num6 = num1 / num2;
        //Mostramos la media
        System.out.println("Suma = " + num3);
        System.out.println("Resta = " + num4);
        System.out.println("Multiplicacion = " + num5);
        System.out.println("Division = " + num6);
        //Cerramos el scanner
        reader.close();
    }
}
