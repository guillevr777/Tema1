package parte1;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
        //creamos el escaner
        Scanner reader = new Scanner(System.in);
        //pedimos el radio de circunsferencia
        System.out.print("Ingresa el radio de la circunferencia");
        double radio = reader.nextDouble();
        //calculamos la longitud de la circunferencia
        double longitud = 2 * Math.PI * radio;
        // Calculamos el área de la circunferencia
        double area = Math.PI * Math.pow(radio, 2);
        // Mostramos los resultados
        System.out.println("La longitud de la circunferencia es " + longitud);
        System.out.println("El área de la circunferencia es " + area);
        //cerramos el scanner
        reader.close();
    }
}
