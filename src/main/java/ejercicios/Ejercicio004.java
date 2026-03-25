package ejercicios;

public class Ejercicio004 {
	//COMPLETAR METODO
	public double calcularArea(double base, double altura) {
		return (base*altura)/2;
    }

    public static void main(String[] args) {
    	Ejercicio004 ejercicio004 = new Ejercicio004();
    	
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Introduce la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = ejercicio004.calcularArea(base, altura);
        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }
}
