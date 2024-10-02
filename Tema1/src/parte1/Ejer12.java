package parte1;

import java.util.Scanner;

public class Ejer12 {
	
	public static void main(String[]args) {
	//creamos el escaner
	Scanner reader = new Scanner(System.in);
	//creamos las variables
	double pera;
	double manzana;
	double numPera;
	double numManzana;
	double total;
	//pedimos saber cuantas manzanas vendio
	System.out.println("introduce la cantidad de manzanas que vendiste");
	//ponemos a funcionar el escaner
	numManzana = reader.nextDouble();
	//pedimos saber cuantas peras vendio
	System.out.println("introduce la cantidad de peras que vendiste");
	numPera = reader.nextDouble();
	//le ponemos valor a las variables
	pera = 1.95;
	manzana = 2.35;
	total = numPera*pera + numManzana*manzana;
	//le mostramos el resultado
	System.out.println("Vendio un total de " + total + " euros en manzanas y peras");
	//cerramos el escaner
	reader.close();
	}
}