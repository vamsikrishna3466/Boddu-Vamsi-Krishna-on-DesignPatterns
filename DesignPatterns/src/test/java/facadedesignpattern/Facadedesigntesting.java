package facadedesignpattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class Facadedesigntesting {

	@Test
	public void test() {
		Facadedesign facadedesignobject=new Facadedesign();
		assertEquals(1,facadedesignobject.objectCreation("kfc"));
		assertEquals(1,facadedesignobject.objectCreation("expresso"));
		assertEquals(0,facadedesignobject.objectCreation("RRDarbar"));
		
	}

}
