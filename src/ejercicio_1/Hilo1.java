package ejercicio_1;

import java.util.Random;

public class Hilo1 extends Thread{
	
	Impresora impresora;
	String nombre;

	

	public Hilo1(Impresora impresora, String nombre) {
		super();
		this.impresora = impresora;
		this.nombre = nombre;
	}

	public Impresora getImpresora() {
		return impresora;
	}

	public void setImpresora(Impresora impresora) {
		this.impresora = impresora;
	}

	public String getNombreString() {
		return nombre;
	}

	public void setNombreString(String nombreString) {
		this.nombre = nombreString;
	}
	
	public void run() {
		synchronized (impresora) {
			for(int i =0; i<20; i++) {
				
				Random rand = new Random();
				int max = 200;
				int int_random = rand.nextInt(max);

				try {
					Thread.sleep(int_random);
				} catch (Exception e) {
					e.printStackTrace();
					
				}
				impresora.imprimirHilo(nombre);
				impresora.setHilo1(true);
			    impresora.notify(); 
				
				try {
					impresora.wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			impresora.notify();
		}
	}
	
}
