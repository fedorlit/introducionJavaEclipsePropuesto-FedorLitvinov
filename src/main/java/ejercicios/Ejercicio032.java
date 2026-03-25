package ejercicios;

import java.util.Scanner;

public class Ejercicio032 {
	
	//COMPLETAR METODO
	public void contarParesArray() {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos números vas a introducir?: ");
        int tamano = sc.nextInt();
        
        int[] numeros = new int[tamano];
        int contadorPares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nNúmeros pares encontrados: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                contadorPares++;
            }
        }

        System.out.println("Total de números pares: " + contadorPares);
        System.out.println("Total de números impares: " + (tamano - contadorPares));
        
        sc.close();
    }
    
    public static void main(String[] args) {
        Ejercicio032 ejercicio = new Ejercicio032();
        ejercicio.contarParesArray();
    }
    
}
