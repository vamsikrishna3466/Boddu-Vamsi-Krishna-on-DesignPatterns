package compositedesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HeadOfDepartment implements Message{
	private final Logger compositedesignloggerofhod=LogManager.getLogger(HeadOfDepartment.class);
	public void notify(String message)
	{
		Professor professorobject=new Professor();
		compositedesignloggerofhod.info("message is sent from HOD to professor");
		professorobject.notify(message);
	}

}
