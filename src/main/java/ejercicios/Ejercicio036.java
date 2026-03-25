package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio036 {
	
	//COMPLETAR METODO
	public void comprobarPalindromo() {Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos elementos tendrá el array?: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nArray a evaluar: " + Arrays.toString(numeros));

        boolean esPalindromo = true;
        
        for (int i = 0; i < n / 2; i++) {
            
            if (numeros[i] != numeros[n - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("El array es un palíndromo.");
        } else {
            System.out.println("El array NO es un palíndromo.");
        }
        
        sc.close();
	}
    
    public static void main(String[] args) {
        Ejercicio036 ejercicio = new Ejercicio036();
        ejercicio.comprobarPalindromo();
    }
    
}
