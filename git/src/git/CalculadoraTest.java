
package git;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	Calculadora c;
	@Before
	public void setUp() throws Exception {
		c=new Calculadora(5,3);
	}

	@Test
	public void testCalculadora() {
		Calculadora c1=new Calculadora(3,2);
		assertEquals(3,c1.getNumero1());
		assertEquals(2,c1.getNumero2());
	}

	@Test
	public void testMultiplicar() {
		assertEquals(15,c.multiplicar());
	}

	@Test
	public void testGetNumero1() {
		assertEquals(5,c.getNumero1());
	}

	@Test
	public void testSetNumero1() {
		c.setNumero1(11);
		assertEquals(11,c.getNumero1());
	}

	@Test
	public void testGetNumero2() {
		assertEquals(3,c.getNumero2());
	}

	@Test
	public void testSetNumero2() {
		c.setNumero2(31);
		assertEquals(31,c.getNumero2());
	}

	@Test
	public void testToString() {
		assertEquals("Calculadora [numero1=5, numero2=3]","Calculadora [numero1="+c.getNumero1()+", numero2="+c.getNumero2()+"]");
	}

	@Test
	public void testDivision() {
		Calculadora calculadora = new Calculadora(6,2);
		double resultado = calculadora.division(calculadora.getNumero1(), calculadora.getNumero2());
		double esperado = 3;
		assertEquals(esperado,resultado,0.01);
	}

}

