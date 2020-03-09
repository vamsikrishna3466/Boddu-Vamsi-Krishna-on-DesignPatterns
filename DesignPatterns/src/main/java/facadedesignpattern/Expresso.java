package facadedesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Expresso extends Hotel {
	private final Logger facadedesignexpresso=LogManager.getLogger( Expresso.class);
	public void price()
	{
		facadedesignexpresso.info("The price is 100000");
	}
	public void message()
	{
		facadedesignexpresso.info("I am in Expresso Hotel");
	}

}
