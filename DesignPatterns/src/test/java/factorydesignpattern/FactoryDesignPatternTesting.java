package factorydesignpattern;
import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryDesignPatternTesting {

	@Test
	public void test() {
		FactoryDesign factorydesignobject=new FactoryDesign();
		assertEquals(87.88,factorydesignobject.mealsCostCalculation("fullmeals"),0.1);
		assertEquals(54.36,factorydesignobject.mealsCostCalculation("halfmeals"),0.1);
		assertEquals(0.0,factorydesignobject.mealsCostCalculation("meals"),0.1);
	}

}
