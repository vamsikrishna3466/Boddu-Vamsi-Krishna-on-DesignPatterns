package strategydesignpattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTesting {

	@Test
	public void test() {
		Calculator calculatorobject=new Calculator();
		assertEquals(5.1,calculatorobject.addition(2.1,3.0),0.1);
		assertEquals(0.9,calculatorobject.subtraction(3.0,2.1),0.1);
		assertEquals(6.3,calculatorobject.multiplication(2.1,3.0),0.1);
		
	}

}
