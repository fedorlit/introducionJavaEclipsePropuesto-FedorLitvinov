package ejercicios;

import java.util.Scanner;

public class Ejercicio029 {
	
	//COMPLETAR METODO
	public void secuenciaFibonacci() {
		Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos de la secuencia quieres ver?: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Debes introducir un número entero.");
            return;
        }

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Introduce un número mayor que 0.");
            return;
        }

        System.out.println("Secuencia de Fibonacci de " + n + " términos:");

        long a = 0; 
        long b = 1; 

        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : ""));

            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
        System.out.println();
        sc.close();
    }

    public static void main(String[] args) {
        Ejercicio029 ejercicio = new Ejercicio029();
        ejercicio.secuenciaFibonacci();
    }
}
