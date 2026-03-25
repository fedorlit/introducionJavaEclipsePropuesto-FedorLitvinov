package ejercicios;

public class Ejercicio019 {
	
	//COMPLETAR METODO
	public int potencia(int base, int exponente) {
		if (exponente < 0) {
	        System.out.println("Error: El exponente no debe ser negativo.");
	        return -1; 
	    }

	    int resultado = 1;
	    
	    for (int i = 0; i < exponente; i++) {
	        resultado *= base;
	    }
	    
	    return resultado;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Ejercicio019 ejercicio = new Ejercicio019();
        
        System.out.print("Introduce la base: ");
        int base = scanner.nextInt();
        
        System.out.print("Introduce el exponente: ");
        int exponente = scanner.nextInt();
        
        try {
            int resultado = ejercicio.potencia(base, exponente);
            System.out.println(base + "^" + exponente + " = " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
