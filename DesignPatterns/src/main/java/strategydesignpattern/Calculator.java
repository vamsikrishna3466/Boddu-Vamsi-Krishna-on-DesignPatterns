package strategydesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
	private final Logger strategydesignpattern=LogManager.getLogger(Calculator.class);
	public double addition(double d,double e)
	{
		double add=d+e;
		strategydesignpattern.debug("The addition of two numbers {} {} is {}",d,e,add);
		return add;
	}
	public double subtraction(double first,double second)
	{
		double sub=first-second;
		strategydesignpattern.debug("The subtraction of two numbers {} {} is {}",first,second,sub);
		return sub;
	}
	public double multiplication(double first,double second)
	{
		double mul=first*second;
	strategydesignpattern.debug("The multiplication of two numbers {} {} is {}",first,second,mul);
	return mul;
	}


}
