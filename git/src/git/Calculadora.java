package git;

public class Calculadora {

	private int numero1;
	private int numero2;

	Calculadora(int n1, int n2) {
		this.numero1 = n1;
		this.numero2 = n2;
	}

	public int getNumero1() {
		return this.numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return this.numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int Suma(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		return resultado;
	}

	public static int resta(int numero1, int numero2) {
		return numero1 - numero2;

	}

	public int multiplicar() {
		return this.numero1 * this.numero2;
	}

	public double division(int numero1, int numero2) {
		double resultado = numero1 / numero2;
		return resultado;
	}

}
