package ejercicios;

public class Ejercicio008 {
	
	//COMPLETAR METODO
	public boolean esBisiesto(int año) {
		return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
	//COMPLETAR METODO
    public String describirAño(int año) {
    	if (esBisiesto(año)) {
            return "El año " + año + " es bisiesto";
        } else {
            return "El año " + año + " no es bisiesto";
        }
    }

    public static void main(String[] args) {
    	Ejercicio008 ejercicio008 = new Ejercicio008();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce un año: ");
        int año = scanner.nextInt();

        System.out.println(ejercicio008.describirAño(año));

        scanner.close();
    }
}
