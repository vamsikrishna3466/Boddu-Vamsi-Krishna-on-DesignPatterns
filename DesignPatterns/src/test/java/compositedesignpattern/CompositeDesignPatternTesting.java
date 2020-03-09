package compositedesignpattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompositeDesignPatternTesting {

	@Test
	public void test() {
		CompositeDesign compositedesignobject=new CompositeDesign();
		assertEquals(1,compositedesignobject.notification("Tomorrow is a holiday"));
		
	}

}
