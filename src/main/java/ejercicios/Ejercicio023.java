package ejercicios;

import java.util.Scanner;

public class Ejercicio023 {
	
	//COMPLETAR METODO
	public void contarVocales() {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();
        
        int total = contarVocalesEnFrase(frase);
        
        System.out.println("La frase contiene " + total + " vocales.");
        
        scanner.close();
    }
	//COMPLETAR METODO
    private int contarVocalesEnFrase(String frase) {
    	int contador = 0;
        String fraseMinusculas = frase.toLowerCase();

        for (int i = 0; i < fraseMinusculas.length(); i++) {
            char c = fraseMinusculas.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
    

    public static void main(String[] args) {
        Ejercicio023 ejercicio = new Ejercicio023();
        ejercicio.contarVocales();
    }
}
