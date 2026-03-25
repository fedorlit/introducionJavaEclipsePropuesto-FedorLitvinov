package ejercicios;

import java.util.Scanner;

public class Ejercicio034 {
	
	//COMPLETAR METODO
	public void buscarNumeroArray() {
		Scanner sc = new Scanner(System.in);
        
        int[] numeros = {1, 67, 78, 23, 8, 89, 111, 5};
        
        System.out.print("¿Qué número deseas buscar en el sistema?: ");
        int objetivo = sc.nextInt();
        
        boolean encontrado = false;
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == objetivo) {
                encontrado = true;
                posicion = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("¡Número encontrado! Está en la posición (índice): " + posicion);
        } else {
            System.out.println("El número " + objetivo + " no se encuentra en el array.");
        }
        
        sc.close();
    }
    
    public static void main(String[] args) {
        Ejercicio034 ejercicio = new Ejercicio034();
        ejercicio.buscarNumeroArray();
    }
    
}
