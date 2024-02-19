package ejercicio_1;

public class Impresora {

	private boolean isHilo1 = false;
	
	
	public void imprimirHilo(String nombre) {
		System.out.println(nombre);
	}


	public boolean isHilo1() {
		return isHilo1;
	}

	public void setHilo1(boolean isHilo1) {
		this.isHilo1 = isHilo1;
	}
	
}
