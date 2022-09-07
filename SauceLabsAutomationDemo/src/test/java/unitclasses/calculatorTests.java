package unitclasses;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import calculator.calculator;

public class calculatorTests {
	
	public static calculator objcal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		objcal=new calculator();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.gc();
	}

	@Test
	public final void test() {
	//	fail("Not yet implemented"); // TODO
		
		assertEquals("Hello world",objcal.getString());
	}

}
