package ejercicios;

import java.util.Scanner;

public class Ejercicio012 {
	
	//COMPLETAR METODO
	public int sumarHastaCero() {
		Scanner scanner = new Scanner(System.in);
	    int suma = 0;
	    int numero;

	    do {
	        System.out.print("Introduce un número (0 para terminar): ");
	        numero = scanner.nextInt();
	        suma += numero;
	    } while (numero != 0);

	    return suma;
    }
	

    public static void main(String[] args) {
    	Ejercicio012 ejercicio012 = new Ejercicio012();
        double resultado = ejercicio012.sumarHastaCero();
        System.out.println("La suma total es: " + resultado);
    }
}
