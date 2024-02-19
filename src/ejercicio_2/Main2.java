package ejercicio_2;

public class Main2 {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora(100);
		
		HiloSuma hiloSumar = new HiloSuma(calculadora);
		HiloResta hiloResta = new HiloResta(calculadora);
		
		hiloSumar.start();
		hiloResta.start();
		
		try {
			hiloSumar.join();
			hiloResta.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("El valor compartido de ambos hilos es: " +calculadora.numerofinal());

	}

}
