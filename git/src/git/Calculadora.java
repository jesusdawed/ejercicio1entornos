package git;

public class Calculadora {

	public int Suma(int numero1,int numero2) {
		int resultado=numero1+numero2;
		return resultado;
	}



	private int numero1;
	private int numero2;
	
	Calculadora(int n1,int n2){
		this.numero1=n1;
		this.numero2=n2;
	}

	
	public static int resta(int numero1, int numero2){
	       return numero1-numero2;
	             
}

	public int multiplicar() {
		return this.numero1*this.numero2;
	}

}


