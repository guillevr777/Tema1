package Parte1;

import java.util.Scanner;

public class ejer3 {
	public static void main(String[] args) {
        //creamos el escaner
        Scanner reader = new Scanner(System.in);
        //pedimos al usuario que ingrese el año actual
        System.out.print("Ingresa el año actual");
        int añoactual = reader.nextInt();
        //pedimos al usuario que ingrese su año de nacimiento
        System.out.print("Ingresa tu año de nacimiento: ");
        int añonacimiento = reader.nextInt();
        //calculamos la edad del usuario
        int edad = añoactual - añonacimiento;
        //mostramos la edad del usuario
        System.out.println("Tienes " + edad + " años.");
        //cerramos el scanner para liberar recursos
        reader.close();
    }
}
