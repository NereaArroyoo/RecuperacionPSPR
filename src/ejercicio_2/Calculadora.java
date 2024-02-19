package ejercicio_2;

public class Calculadora {

	double decimal;

	public Calculadora(double decimal) {
		super();
		this.decimal = decimal;
	}

	public double getDecimal() {
		return decimal;
	}

	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}
	
	public synchronized void suma(int numero) {
		decimal += numero;
		if(decimal < 0) {
			decimal=0; //asi el valor del decimal nunca es nulo
		}
	}
	
	public synchronized void resta(int numero) {
		decimal -= numero;
		if(decimal < 0) {
			decimal=0; //asi el valor del decimal nunca es nulo
		}
	}
	
	public double numerofinal() {
		return decimal;
	}
}
