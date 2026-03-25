package ejercicios;

public class Ejercicio014 {
	//COMPLETAR METODO
	public long calcularFactorial(int n) {
		if (n < 0) {
			System.out.print("El número debe ser no negativo.");
			return -1;
	    }
	    
	    long resultado = 1;
	    for (int i = 1; i <= n; i++) {
	        resultado *= i;
	    }
	    
	    return resultado;
    }

    public static void main(String[] args) {
    	Ejercicio014 ejercicio014 = new Ejercicio014();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        try {
            long factorial = ejercicio014.calcularFactorial(numero);
            System.out.println(numero + "! = " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}
