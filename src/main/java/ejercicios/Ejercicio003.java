package ejercicios;

public class Ejercicio003 {
	//COMPLETAR METODO
	public double celsiusAFahrenheit(double celsius) {
		return (celsius * 9/5)+32;
    }

    public static void main(String[] args) {
    	Ejercicio003 ejercicio003 = new Ejercicio003();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = ejercicio003.celsiusAFahrenheit(celsius);
        System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F.");

        scanner.close();
    }
}
