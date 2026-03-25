package ejercicios;

import java.util.Scanner;

public class Ejercicio027 {
	
	//COMPLETAR METODO
	public void decimalABinario() {
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal entero: ");
        
        if (!sc.hasNextInt()) {
            System.out.println("Por favor, introduce un número válido.");
            return;
        }

        int decimal = sc.nextInt();
        
        if (decimal == 0) {
            System.out.println("El binario es: 0");
            return;
        }

        String binario = "";
        int temp = decimal;

        while (temp > 0) {
            int resto = temp % 2;
            binario = resto + binario;
            temp = temp / 2;
        }

        System.out.println("El número " + decimal + " en binario es: " + binario);
        sc.close();
    }

    public static void main(String[] args) {
        Ejercicio027 ejercicio = new Ejercicio027();
        ejercicio.decimalABinario();
    }
}
