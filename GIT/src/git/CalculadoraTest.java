package git;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void testDivision() {
		Calculadora calculadora = new Calculadora(6,2);
		double resultado = calculadora.division(calculadora.getNumero1(), calculadora.getNumero2());
		double esperado = 3;
		assertEquals(esperado,resultado,0.01);
		
	}

}
