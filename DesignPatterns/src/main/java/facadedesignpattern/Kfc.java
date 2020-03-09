package facadedesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Kfc extends Hotel {
	private final Logger facadedesignkfc=LogManager.getLogger(Kfc.class);
	public void price()
	{
		facadedesignkfc.info("The price is 20000");
	}
	public void message()
	{
		facadedesignkfc.info("I am in kfc Hotel");
	}

}
