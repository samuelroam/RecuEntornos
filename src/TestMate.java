
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestMate {

	@Test
	public void testSuma() {
		Matematica mates = new Matematica();
		int a = 3;
		int b = 2;
		int resultado = mates.suma(a, b);

		int esperado = 5;

		assertEquals(esperado, resultado);

	}
	
	@Test
	public void testComparar() {
		
		Matematica mates = new Matematica();
		 
		assertTrue(mates.mayor(7, 3));
	
	}
	
	@Test
	public void testDevolver() {
		ArrayList<Integer> sumas = new ArrayList<Integer>();
		
		Matematica mates = new Matematica();
		int a = 5;
		int b = 4;
		int resultado = mates.suma(a, b);
		sumas.add(resultado);

		assertSame(mates.sumar().get(0),9 );

	}

}



