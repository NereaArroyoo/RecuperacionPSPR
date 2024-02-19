package ejercicio_1;

public class Main1 {

	public static void main(String[] args) {
			
		Impresora impresora = new Impresora();
		
		Hilo1 hilo1 = new Hilo1(impresora, "Primer Hilo");
		Hilo2 hilo2 = new Hilo2(impresora, "Segundo Hilo");
		
		hilo2.start();
		hilo1.start();
		
	}

}
