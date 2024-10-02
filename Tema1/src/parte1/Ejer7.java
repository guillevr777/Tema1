package parte1;

import java.util.Scanner;

public class Ejer7 {
	
	public static void main(String[] args) {
		
		String calle;
		String numero;
		String nombre;
		
        //Creamos el escaner
        Scanner reader = new Scanner(System.in);
        
        //preguntamos por Nombre , direccion y telefono
        System.out.print("Di tu nombre");
        nombre = reader.nextLine();
        
        System.out.print("Di tu numero");
        numero = reader.nextLine();
        
        System.out.print("Di tu calle");
        calle = reader.nextLine();
        
        
        //Mostramos las respuestas
        System.out.println("Nombre : " + nombre);
        System.out.println("Dirección : " + calle);
        System.out.println("Numero : " + numero);
        
        //Cerramos el scanner
        reader.close();
    }
}
