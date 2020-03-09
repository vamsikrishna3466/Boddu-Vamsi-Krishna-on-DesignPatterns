package templatedesign;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class TemplateDesignPattern {
	Products productsobject;
	private final Logger templatedesignlogger=(Logger) LogManager.getLogger(TemplateDesignPattern.class);
	public double objectCreation(double cost)
	{
		productsobject=new Milk();
		cost=cost+productsobject.price();
		productsobject=new Sugar();
		cost=cost+productsobject.price();
		return cost;
	}
	public int costOfMakingTea()
	{
		double costoftea=this.objectCreation(0.0);
		productsobject=new TeaPowder();
		costoftea=costoftea+productsobject.price();
		templatedesignlogger.debug("The cost price for making tea is {} ",costoftea);
		return 1;
	}
	public int costOfMakingCoffee()
	{
		double costofcoffee=this.objectCreation(0.0);
		productsobject=new CoffeePowder();
		costofcoffee=costofcoffee+productsobject.price();
		templatedesignlogger.debug("The cost price for making tea is {} ",costofcoffee);
		return 1;
	}
	

}
