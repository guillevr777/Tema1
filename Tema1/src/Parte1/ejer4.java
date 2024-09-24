package Parte1;

import java.util.Scanner;

public class ejer4 {
	public static void main(String[] args) {
		double nota1;
		double nota2;
		double media;
        //Creamos el escaner
        Scanner reader = new Scanner(System.in);
        //pedimos primera nota
        System.out.print("Ingresa la primera nota");
        nota1 = reader.nextDouble();
        //pedimos segunda nota
        System.out.print("Ingresa la segunda nota");
        nota2 = reader.nextDouble();
        //Calculamos la media
        media = (nota1 + nota2) / 2.0;
        //Mostramos la media
        System.out.println("La media es de " + media);
        //Cerramos el scanner
        reader.close();
    }
}
