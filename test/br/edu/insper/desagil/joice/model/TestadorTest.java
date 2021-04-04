package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestadorTest {
	private CalculadoraCCC calculaccc;
	private CalculadoraCFC calculacfc;

	@BeforeEach
	private void setUp() {
	    calculaccc = new CalculadoraCCC();
	    calculacfc = new CalculadoraCFC();
	}

	@Test
	public void testeNiobio() {
	    assertEquals(8.57, calculaccc.calcula(92.91, 0.143), 0.05);
	}

	@Test
	public void testeCobre() {
		assertEquals(8.89, calculacfc.calcula(63.55, 0.128), 0.05);
	}

	@Test
	public void testeTugstenio() {
		assertEquals(19.28, calculaccc.calcula(183.84, 0.137), 0.05);
	}

	@Test
	public void testeOuro() {
		assertEquals(19.36, calculacfc.calcula(196.97, 0.144), 0.05);
	}

	@Test
	public void testeLitio() {
		assertEquals(0.53, calculaccc.calcula(6.94, 0.152), 0.05);
	}

	@Test
	public void testePrata() {
		assertEquals(10.60, calculacfc.calcula(107.87, 0.144), 0.05);
	}


}
