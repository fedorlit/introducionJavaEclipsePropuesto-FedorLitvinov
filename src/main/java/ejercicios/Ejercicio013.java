package ejercicios;

public class Ejercicio013 {
	
	//COMPLETAR METODO
	public void mostrarPrimeros20Pares() {
		System.out.println("Primeros 20 números pares:");
	    int contador = 0;
	    int numero = 2;

	    while (contador < 20) {
	        System.out.println(numero);
	        numero += 2;
	        contador++;
	    }
    }

    public static void main(String[] args) {
    	Ejercicio013 ejercicio013 = new Ejercicio013();
    	ejercicio013.mostrarPrimeros20Pares();
    }
}
