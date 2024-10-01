package parte2;

import java.util.Scanner;

public class ejer7 {
	public static void main(String[]args) {
		//creamos el escaner
		Scanner reader = new Scanner(System.in);
		//Creamos las 2 variables que tendran valores constantes
		final double menor = 15.50;
		final double mayor = 20;
		
		double descuento; 
		double resultado;
		//variables para recoger el numero de personas (tanto adultos como menores) y niños (solo menores)
		int personas;
		int niños;
		//variables para calcular total de entradas adultos y niños por separado
		double entradaNiños;
		double entradaAdulto;
		//variable del calculo total
		double resultadofinal;
		//Pedimos numero de personas total
		System.out.println("Di el numero de personas");
		personas = reader.nextInt();
		//Pedimos el numero de menores entre el total de personas
		System.out.println("Di cuantos son menores");
		niños = reader.nextInt();
		//Calculamos el total de entradas para adultos y niños
		entradaNiños = (personas - niños) * 20;
		entradaAdulto = niños*15.50;
		//Calculamos el descuento
		resultado  = (entradaNiños + entradaAdulto);
		descuento = resultado<=100 ? 0 : resultado*0.05;
		resultadofinal = resultado - descuento;
		//mostramos el resultado
		System.out.println("Sera un total de " + resultadofinal + " descontando el 5% por superar los 100 euros , el descuento total ha sido de " + descuento);
		//cerramos el escaner
		reader.close();
	}
}
