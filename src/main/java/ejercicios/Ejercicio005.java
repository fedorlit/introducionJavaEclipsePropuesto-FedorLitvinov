package ejercicios;

public class Ejercicio005 {
	
	//COMPLETAR METODO
	public String describirNumero(int numero) {
		if (numero > 0) {
	        return "El número es positivo";
	    } else if (numero < 0) {
	        return "El número es negativo";
	    } else {
	        return "El número es cero";
	    }
    }

    public static void main(String[] args) {
    	Ejercicio005 ejercicio005 = new Ejercicio005();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        String mensaje = ejercicio005.describirNumero(numero);
        System.out.println(mensaje);

        scanner.close();
    }
}
