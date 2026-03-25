package ejercicios;

public class Ejercicio007 {
	
	//COMPLETAR METODO
	public String obtenerDiaSemana(int dia) {
		switch (dia) {
        case 1: return "Lunes";
        case 2: return "Martes";
        case 3: return "Miércoles";
        case 4: return "Jueves";
        case 5: return "Viernes";
        case 6: return "Sábado";
        case 7: return "Domingo";
        default: return "Número inválido";
		}
    }

    public static void main(String[] args) {
    	Ejercicio007 ejercicio007 = new Ejercicio007();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce un número del 1 al 7: ");
        int dia = scanner.nextInt();

        String nombreDia = ejercicio007.obtenerDiaSemana(dia);
        System.out.println(nombreDia);

        scanner.close();
    }
}
