package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio026 {
	
	//COMPLETAR METODO
	public void gestorUsuarios() {
		Scanner sc = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        String nombre;

        System.out.println("Introduce nombres (escribe 'fin' para terminar):");

        while (true) {
            System.out.print("Nombre: ");
            nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            if (!nombre.trim().isEmpty()) {
                nombres.add(nombre);
            }
        }

        if (nombres.isEmpty()) {
            System.out.println("No se introdujeron nombres.");
        } else {
            String masLargo = nombres.get(0);
            String masCorto = nombres.get(0);

            for (String n : nombres) {
                if (n.length() > masLargo.length()) {
                    masLargo = n;
                }
                if (n.length() < masCorto.length()) {
                    masCorto = n;
                }
            }

            System.out.println("Cantidad de nombres: " + nombres.size());
            System.out.println("Nombre más largo: " + masLargo);
            System.out.println("Nombre más corto: " + masCorto);
        }
        
        sc.close();
    }

    public static void main(String[] args) {
        Ejercicio026 ejercicio = new Ejercicio026();
        ejercicio.gestorUsuarios();
    }
}
