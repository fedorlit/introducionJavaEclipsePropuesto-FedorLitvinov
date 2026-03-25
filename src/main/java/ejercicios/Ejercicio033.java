package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio033 {
	
	//COMPLETAR METODO
	public void invertirArray() {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos elementos tendrá el array?: ");
        int n = sc.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nArray original: " + Arrays.toString(numeros));

        for (int i = 0; i < n / 2; i++) {
            int temp = numeros[i];
            
            numeros[i] = numeros[n - 1 - i];
            
            numeros[n - 1 - i] = temp;
        }

        System.out.println("Array invertido: " + Arrays.toString(numeros));
        
        sc.close();
    }
    
    public static void main(String[] args) {
        Ejercicio033 ejercicio = new Ejercicio033();
        ejercicio.invertirArray();
    }
    
}
