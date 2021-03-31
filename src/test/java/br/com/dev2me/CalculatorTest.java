package br.com.dev2me;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void deveriaSomarDoisValoresPassados() {
		int valora = 2;
		int valorb = 2;
		int soma = 1;
		
		Calculator calc = new CalculatorImpl();
		soma = calc.sum(valora, valorb);
		
		assertEquals(soma, 4);
	}
	
	@Test
	public void deveriaSubtrairDoisValoresPassados() {
		int valora = 4;
		int valorb = 2;
		int sub = 0;
		
		Calculator calc = new CalculatorImpl();
		sub = calc.subtraction(valora, valorb);
		
		assertEquals(sub, 2);
	}
	
	@Test
	public void deveriaMultiplicarDoisValoresPassados() {
		int valora = 2;
		int valorb = 2;
		int multi = 0;
		
		Calculator calc = new CalculatorImpl();
		multi = calc.multiplication(valora, valorb);
		
		assertEquals(multi, 4);
	}
	
	@Test
	public void deveriaDividirDoisValoresPassados() {
		int valora = 4;
		int valorb = 2;
		int divi = 0;
		
		Calculator calc = new CalculatorImpl();
		divi = calc.division(valora, valorb);
		
		assertEquals(divi, 2);
	}
	
	@Test
	public void deveriaSerIgualDoisValoresPassados() {
		int valora = 2;
		int valorb = 2;
		boolean ehIgual = false;
		
		Calculator calc = new CalculatorImpl();
		ehIgual = calc.equalsIntegers(valora, valorb);
		
		assertTrue(ehIgual);
	}

}
