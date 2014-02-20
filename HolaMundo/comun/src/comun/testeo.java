package comun;

import static org.junit.Assert.*;
import comun.calculo;

import org.junit.Test;

public class testeo {
	
	private calculo cal = new calculo(); 

	@Test
	public void test() {
		assertEquals(2,cal.calmcd(2,2));
	}
	

}
