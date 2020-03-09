package factorydesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class FactoryDesign {
	private static final Logger FACTORYDESIGNLOGGER=LogManager.getLogger(FactoryDesign.class);
	public double mealsCostCalculation(String mealtype)
	{
		Meals mealsobject=null;
		FACTORYDESIGNLOGGER.info("In Factory Design pattern");
		FACTORYDESIGNLOGGER.info("ENTER THE MEAL TYPE");
		if(mealtype.equalsIgnoreCase("fullmeals"))
		{
			mealsobject=new FullMeals();
		}
		else if(mealtype.equalsIgnoreCase("halfmeals"))
		{
			mealsobject=new HalfMeals();	
		}
		else
		{
			FACTORYDESIGNLOGGER.error("INVALID INPUT");
			return 0.0;
		}
		
			 double mealcost=mealsobject.costCalucaluation();
			FACTORYDESIGNLOGGER.debug("The {} cost is {} ",mealtype,mealcost);
			return mealcost;
		}
		
	}


