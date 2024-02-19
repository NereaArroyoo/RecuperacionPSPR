package ejercicio_1;

import java.util.Random;

public class Hilo2 extends Thread{
	
	Impresora impresora;
	String nombre;

	

	public Hilo2(Impresora impresora, String nombre) {
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
			
				if(!this.impresora.isHilo1()) {
					try {
						this.impresora.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
				impresora.imprimirHilo(nombre);
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
