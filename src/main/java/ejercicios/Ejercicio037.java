package ejercicios;

import java.util.Arrays;

public class Ejercicio037 {
	
	//COMPLETAR METODO
	public void contarRepeticiones() {
		int[] numeros = {1, 1, 8, 4, 2, 2, 2, 5, 1};
        
        boolean[] visitado = new boolean[numeros.length];
        
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("--- Frecuencia de números ---");

        for (int i = 0; i < numeros.length; i++) {
            if (visitado[i]) {
                continue;
            }

            int contador = 1;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    visitado[j] = true;
                    contador++;
                }
            }
            
            System.out.println("El número " + numeros[i] + " aparece " + contador + " veces.");
        }
    }
    
    public static void main(String[] args) {
        Ejercicio037 ejercicio = new Ejercicio037();
        ejercicio.contarRepeticiones();
    }
}
