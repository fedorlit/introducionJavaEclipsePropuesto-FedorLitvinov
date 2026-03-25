package ejercicios;

public class Ejercicio009 {
	
	//COMPLETAR METODO
	public double obtenerMayor(double a, double b, double c) {
		double mayor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;
        }

        return mayor;
    }

    public static void main(String[] args) {
        Ejercicio009 ejercicio009 = new Ejercicio009();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce el tercer número: ");
        double num3 = scanner.nextDouble();

        System.out.println("El mayor es: " + ejercicio009.obtenerMayor(num1, num2, num3));

        scanner.close();
    }
}
