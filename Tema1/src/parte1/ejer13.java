package parte1;

import java.util.Scanner;

public class ejer13 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//creamos las variables
		boolean lluvia;
		boolean tarea;
		boolean biblio;
		boolean salir;
		//preguntar si esta lloviendo
		System.out.println("esta lloviendo?");
		lluvia = reader.nextBoolean();
		//preguntar si termino las tareas
		System.out.println("terminaste las tareas?");
		tarea = reader.nextBoolean();
		//preguntar si quiere ir a la biblioteca
		System.out.println("quieres ir a la biblioteca?");
		biblio = reader.nextBoolean();
		//averiguar si puede salir
		salir = lluvia || tarea && biblio;
		System.out.println("Puedes salir? "  + salir);
		reader.close();
	}
}
