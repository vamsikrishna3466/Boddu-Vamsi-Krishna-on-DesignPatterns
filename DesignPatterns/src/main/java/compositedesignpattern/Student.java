package compositedesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Student implements Message{
	private final Logger compositedesignloggerstudent=LogManager.getLogger(Student.class);
	public void notify(String message)
	{
		compositedesignloggerstudent.info("message is reached to student");
	}

}
