package compositedesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompositeDesign {
	private final Logger compositedesignloggerofchancellor=LogManager.getLogger( CompositeDesign.class);
	public int notification(String message)
	{
		compositedesignloggerofchancellor.info("Vice Chancellor sending message to HOD");
		HeadOfDepartment headofdepartmentobject=new HeadOfDepartment();
		headofdepartmentobject.notify(message);
		return 1;
	}

}
