package singletondesignpattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleTonDesignTest {

	@Test
	public void test() {
		SingleTonDesign singletondesignobject=new SingleTonDesign();
		assertEquals(1,singletondesignobject.objectCreation());
		assertEquals(1,singletondesignobject.settingDesination("Manager"));
		assertEquals(1,singletondesignobject.settingSalary(100000));
		assertEquals(1,singletondesignobject.settingName("krishna"));
		assertEquals(1,singletondesignobject.detailsPrint());
		assertEquals(101000.00,singletondesignobject.calculateBonus(1000),0.1);
		assertEquals(1,singletondesignobject.checkManager());
		assertEquals(0,singletondesignobject.objectCreation());
		assertEquals(1,singletondesignobject.settingDesination("employee"));
		assertEquals(0,singletondesignobject.checkManager());
		
		
	}

}
