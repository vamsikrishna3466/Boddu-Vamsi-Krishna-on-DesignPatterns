package compositedesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Professor implements Message {
	private final Logger compositedesignloggerofprofessor=LogManager.getLogger(Professor.class);
	public void notify(String message)
	{
		Student studentobject=new Student();
		compositedesignloggerofprofessor.info("message is sent from professor to student");
		studentobject.notify(message);
		
	}
	

}
