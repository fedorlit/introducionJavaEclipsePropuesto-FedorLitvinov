package ejercicios;

import java.util.Scanner;

public class Ejercicio024 {
	
	//COMPLETAR METODO
	public void calculadoraNotas() {
        Scanner scanner = new Scanner(System.in);
        int[] notas = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce nota " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }
        
        /*COMPLETAR
         * CODIGO AQUI
         */
         int suma = 0;
         int notaMax = notas[0];
         int notaMin = notas[0];

         for (int nota : notas) {
             suma += nota;
             if (nota > notaMax) notaMax = nota;
             if (nota < notaMin) notaMin = nota;
         }

         double media = (double) suma / notas.length;

         System.out.println("\n--- RESULTADOS ---");
         System.out.println("Promedio: " + media);
         System.out.println("Nota más alta: " + notaMax);
         System.out.println("Nota más baja: " + notaMin);
        
        scanner.close();
    }

    public static void main(String[] args) {
        Ejercicio024 ejercicio = new Ejercicio024();
        ejercicio.calculadoraNotas();
    }
}
