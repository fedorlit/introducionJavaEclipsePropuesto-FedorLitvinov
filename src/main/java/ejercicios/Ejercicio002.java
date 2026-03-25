package ejercicios;

import java.util.Scanner;

public class Ejercicio002 {
	
	//COMPLETAR METODO
	public static String generarSaludo(String nombre, int edad) {
		return "Hola "+nombre+ ", tienes " + edad + " años.";
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.println(generarSaludo(nombre,edad));
        
        scanner.close();
    }
    
    

}
