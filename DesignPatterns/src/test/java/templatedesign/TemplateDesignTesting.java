package templatedesign;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemplateDesignTesting {

	@Test
	public void test() {
		TemplateDesignPattern templatedesignpatternobject=new TemplateDesignPattern();
		assertEquals(1,templatedesignpatternobject.costOfMakingCoffee());
		assertEquals(1,templatedesignpatternobject.costOfMakingTea());
		
	}

}
