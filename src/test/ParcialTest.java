package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest {
private Parcial parcial;
	
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void raicesTest1() {
		Exception excepcion = assertThrows(Exception.class, () -> this.parcial.raices(0,2,3));
		assertEquals("El primer término debe ser diferente de 0", e.getMessage());
	}
	
	@Test
	public void raicesTest2() {
		Exception excepcion = assertThrows(Exception.class, () -> this.parcial.raices(1,2,25));
		assertEquals("El indeterminante es negativo (Sin solución real)", e.getMessage());
	}
	
	@Test
	public void raicesTest3() {
		assertEquals("x=3, x=2", this.parcial.raices(1, -5, 6));
	}
	
	@Test
	public void raicesTest4() {
		assertEquals("x=2, x=2", this.parcial.raices(1, 4, 4));
	}

}
