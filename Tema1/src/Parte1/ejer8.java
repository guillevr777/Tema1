package Parte1;

import java.util.Scanner;

public class ejer8 {
	
	public static void main(String[] args) {
		
		String nombre;
		String edad;
		
        //Creamos el escaner
        Scanner reader = new Scanner(System.in);
        
        //preguntamos por Nombre , direccion y telefono
        System.out.print("Di tu nombre");
        nombre = reader.nextLine();
        
        System.out.print("Di tu edad");
        edad = reader.nextLine();
        
        
        //Mostramos las respuestas
        System.out.println("hola " + nombre + " ,tienes " + edad + " años , !que mayor eres!.");
        
        //Cerramos el scanner
        reader.close();
    }

}
