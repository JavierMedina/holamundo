package comun;

import static org.junit.Assert.*;
import comun.calculo;

import org.junit.Test;

public class testeo3 {
	
	private calculo cal = new calculo(); 

	@Test
	public void test() {
		assertEquals(true,cal.calPrimo(2));
	}
	

}
