package test;

import org.junit.Assert;
import org.junit.Test;

import simple.Calc;

public class CalcTest {

	@Test
	public void suma() {
		Calc calc = new Calc();
		Assert.assertEquals("Probando suma", 10, calc.suma(5,5));
	}
	
	@Test(expected = Exception.class)
	public void div() {
		Calc calc = new Calc();
		Assert.assertEquals("Probando div", 5, calc.div(10,0));
	}
}
