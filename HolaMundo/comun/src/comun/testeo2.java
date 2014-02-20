package comun;

import static org.junit.Assert.*;
import comun.calculo;

import org.junit.Test;

public class testeo2 {
	
	private calculo cal = new calculo(); 

	@Test
	public void test() {
		assertEquals(2,cal.calmcm(2,2));
	}
	

}
