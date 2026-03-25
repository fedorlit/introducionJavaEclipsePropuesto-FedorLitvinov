package ejercicios;

import java.util.Scanner;

public class Ejercicio031 {
	
	//COMPLETAR METODO
	public void sumarElementosArray() {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos elementos tendrá el array?: ");
        int tamano = sc.nextInt();
        
        int[] numeros = new int[tamano];
        int sumaTotal = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el valor para la posición [" + i + "]: ");
            numeros[i] = sc.nextInt();
        }

        for (int num : numeros) {
            sumaTotal += num;
        }

        System.out.println("La suma de todos los elementos es: " + sumaTotal);
        
        if (tamano > 0) {
            double promedio = (double) sumaTotal / tamano;
            System.out.println("El promedio es: " + promedio);
        }

        sc.close();
    }
    
    public static void main(String[] args) {
        Ejercicio031 ejercicio = new Ejercicio031();
        ejercicio.sumarElementosArray();
    }
    
}
