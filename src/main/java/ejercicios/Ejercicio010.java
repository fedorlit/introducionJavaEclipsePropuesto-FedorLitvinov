package ejercicios;

public class Ejercicio010 {
	
	//COMPLETAR METODO
	public void mostrarFor() {
		System.out.println("Bucle FOR:");
	    for (int i = 1; i <= 5; i++) {
	        System.out.println(i);
	    }
    }
	
	//COMPLETAR METODO
    public void mostrarWhile() {
    	System.out.println("Bucle WHILE:");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    }
    
  //COMPLETAR METODO
    public void mostrarDoWhile() {
    	System.out.println("Bucle DO-WHILE:");
    	int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }

    public static void main(String[] args) {
    	Ejercicio010 ejercicio010 = new Ejercicio010();
    	ejercicio010.mostrarFor();
    	ejercicio010.mostrarWhile();
    	ejercicio010.mostrarDoWhile();
    }
}
