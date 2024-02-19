package ejercicio_2;

import java.util.Random;

public class HiloResta extends Thread{

	private Calculadora calculadora;

	public HiloResta(Calculadora calculadora) {
		super();
		this.calculadora = calculadora;
	}
	
	public void run() {
		for(int i=0; i<50;i++) {
			Random rand = new Random();
			int max = 100;
			int int_random = rand.nextInt(max);

			try {
				Thread.sleep(int_random);
			} catch (Exception e) {
				e.printStackTrace();
			}
			calculadora.resta(20);
		}
	}
}
