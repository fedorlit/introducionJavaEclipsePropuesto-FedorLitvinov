package ejercicios;

import java.util.Scanner;

public class Ejercicio038 {
	// COMPLETAR METODO: Genera numero aleatorio 1-50
    public int generarNumeroSecreto() {
    	return (int) (Math.random() * 50) + 1;
    }
    
    // COMPLETAR METODO: Compara intento con secreto y dice resultado
    public String comprobarIntento(int intento, int numeroSecreto) {
    	if (intento < numeroSecreto) {
            return "Demasiado bajo. ¡Prueba un número más grande!";
        } else if (intento > numeroSecreto) {
            return "Demasiado alto. ¡Prueba un número más pequeño!";
        } else {
            return "¡CORRECTO!";
        }
    }

    // COMPLETAR METODO: Funcion principal que usa ambos modulos
    public void adivinarNumero() {
    	Scanner sc = new Scanner(System.in);
        int numeroSecreto = generarNumeroSecreto();
        int intento;
        int intentosRealizados = 0;
        boolean adivinado = false;

        System.out.println("--- JUEGO: ADIVINA EL NÚMERO (1-50) ---");

        do {
            System.out.print("Introduce tu número: ");
            intento = sc.nextInt();
            intentosRealizados++;

            String resultado = comprobarIntento(intento, numeroSecreto);
            System.out.println(resultado);

            if (intento == numeroSecreto) {
                adivinado = true;
            }

        } while (!adivinado);

        System.out.println("¡Felicidades! Lo lograste en " + intentosRealizados + " intentos.");
        sc.close();
    }
    
    public static void main(String[] args) {
        Ejercicio038 ejercicio = new Ejercicio038();
        ejercicio.adivinarNumero();
    }
}
