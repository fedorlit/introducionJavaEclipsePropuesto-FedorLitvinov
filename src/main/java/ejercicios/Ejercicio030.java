package ejercicios;

import java.util.Scanner;

public class Ejercicio030 {
	
	//COMPLETAR METODO
	public void procesarNumeros() {
		Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Introduce 5 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("\nEl número más grande introducido es: " + mayor);
        
        sc.close();
    }
    
    public static void main(String[] args) {
    	Ejercicio030 ejercicio030 = new Ejercicio030();
    	ejercicio030.procesarNumeros();
    }
    
}
