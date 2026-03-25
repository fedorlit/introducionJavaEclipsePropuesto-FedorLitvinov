package ejercicios;

import java.util.Scanner;

public class Ejercicio015 {
	
	//COMPLETAR METODO
	public void mostrarMultiplosTres(int n) {
		System.out.println("Múltiplos de 3 hasta " + n + ":");
		
		for (int i = 3; i <= n; i += 3) {
	        System.out.print(i + " ");
	    }
		
    }

    public static void main(String[] args) {
    	Ejercicio015 ejercicio015 = new Ejercicio015();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número N: ");
        int n = scanner.nextInt();
        
        if (n < 1) {
            System.out.println("Introduce un número positivo.");
        } else {
        	ejercicio015.mostrarMultiplosTres(n);
        }
        
        scanner.close();
    }
}
