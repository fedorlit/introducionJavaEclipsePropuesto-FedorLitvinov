package ejercicios;

public class Ejercicio018 {
	
	//COMPLETAR METODO
	public void saludar(String nombre) {
		System.out.println("¡Hola, " + nombre + "!");
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Ejercicio018 ejercicio = new Ejercicio018();
        
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        
        ejercicio.saludar(nombre);
        
        scanner.close();
    }
}
