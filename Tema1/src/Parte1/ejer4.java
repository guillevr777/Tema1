package Parte1;

import java.util.Scanner;

public class ejer4 {
	public static void main(String[] args) {
        //Creamos el escaner
        Scanner reader = new Scanner(System.in);
        //pedimos primera nota
        System.out.print("Ingresa la primera nota");
        int nota1 = reader.nextInt();
        //pedimos segunda nota
        System.out.print("Ingresa la segunda nota");
        int nota2 = reader.nextInt();
        //Calculamos la media
        double media = (nota1 + nota2) / 2;
        //Mostramos la media
        System.out.println("La media es de " + media);
        //Cerramos el scanner
        reader.close();
    }
}
