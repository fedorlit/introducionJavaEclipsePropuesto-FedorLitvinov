package ejercicios;

import java.util.Scanner;

public class Ejercicio035 {
	
	//COMPLETAR METODO
	public void calcularMediaArray() {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos números vas a introducir para calcular la media?: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Error: El tamaño debe ser mayor que 0.");
            return;
        }

        int[] numeros = new int[n];
        int sumaTotal = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            sumaTotal += numeros[i];
        }

        double media = (double) sumaTotal / n;

        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Cantidad de elementos: " + n);
        System.out.printf("La media aritmética es: %.2f\n", media);
        
        sc.close();
    }
    
    public static void main(String[] args) {
        Ejercicio035 ejercicio = new Ejercicio035();
        ejercicio.calcularMediaArray();
    }
}
