package ejercicios;

import java.util.Scanner;

public class Ejercicio022 {
	
	//COMPLETAR METODO
	public void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
	    int opcion = 0;

	    do {
	        System.out.println("\n--- CALCULADORA BÁSICA ---");
	        System.out.println("1. Sumar");
	        System.out.println("2. Restar");
	        System.out.println("3. Multiplicar");
	        System.out.println("4. Dividir");
	        System.out.println("0. Salir");
	        System.out.print("Seleccione una opción: ");

	        if (scanner.hasNextInt()) {
	            opcion = scanner.nextInt();
	            
	            switch (opcion) {
	                case 1:
	                    procesarSuma(scanner);
	                    break;
	                case 2:
	                    procesarResta(scanner);
	                    break;
	                case 3:
	                    procesarMultiplicacion(scanner);
	                    break;
	                case 4:
	                    procesarDivision(scanner);
	                    break;
	                case 0:
	                    System.out.println("Saliendo...");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	            }
	        } else {
	            System.out.println("Error: Por favor, introduce un número entero.");
	            scanner.next();
	        }

	    } while (opcion != 0);

	    scanner.close();
	}
        
	//COMPLETAR METODO
    private void procesarSuma(Scanner scanner) {
    	System.out.print("Ingrese primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Resultado: " + (a + b));
    }
    
    //COMPLETAR METODO
    private void procesarResta(Scanner scanner) {
    	System.out.print("Ingrese primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Resultado: " + (a - b));
    }
    
    //COMPLETAR METODO
    private void procesarMultiplicacion(Scanner scanner) {
    	System.out.print("Ingrese primer número: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese segundo número: ");
        double b = scanner.nextDouble();
        System.out.println("Resultado: " + (a * b));
    }
    
    //COMPLETAR METODO
    private void procesarDivision(Scanner scanner) {
    	System.out.print("Ingrese dividendo: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese divisor: ");
        double b = scanner.nextDouble();
        
        if (b != 0) {
            System.out.println("Resultado: " + (a / b));
        } else {
            System.out.println("Error: No se puede dividir entre cero.");
        }
    }
    
    public static void main(String[] args) {
        Ejercicio022 ejercicio = new Ejercicio022();
        ejercicio.mostrarMenu();
    }
}
