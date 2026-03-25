package ejercicios;

import java.util.Scanner;

public class Ejercicio028 {
	
	private double saldo = 1000.0;  // Saldo inicial
	
	//COMPLETAR METODO
    public void cajeroAutomatico() {
    	Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- CAJERO AUTOMÁTICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    consultarSaldo();
                    break;
                case 2:
                    ingresarDinero(scanner);
                    break;
                case 3:
                    retirarDinero(scanner);
                    break;
                case 4:
                    System.out.println("Has salido del cajero.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
    
    //COMPLETAR METODO
    private void consultarSaldo() {
    	System.out.printf("Su saldo actual es: %.2f€\n", saldo);
    }
    
    //COMPLETAR METODO
    private void ingresarDinero(Scanner scanner) {
    	System.out.print("Cantidad a ingresar: ");
        double cantidad = scanner.nextDouble();
        
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Ingreso realizado correctamente.");
        } else {
            System.out.println("La cantidad debe ser mayor que 0.");
        }
    }
    
    //COMPLETAR METODO
    private void retirarDinero(Scanner scanner) {
    	System.out.print("Cantidad a retirar: ");
        double cantidad = scanner.nextDouble();
        
        if (cantidad <= 0) {
            System.out.println("Cantidad no válida.");
        } else if (cantidad > saldo) {
            System.out.println("Error: Saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retirada realizada con éxito.");
        }
    }

    public static void main(String[] args) {
        Ejercicio028 ejercicio = new Ejercicio028();
        ejercicio.cajeroAutomatico();
    }
    
}
