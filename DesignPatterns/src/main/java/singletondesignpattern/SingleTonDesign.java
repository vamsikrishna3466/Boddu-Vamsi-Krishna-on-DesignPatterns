package singletondesignpattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SingleTonDesign {
	Employee employeeobject;
	private final Logger singletonlogger=LogManager.getLogger(SingleTonDesign.class);
	public int objectCreation()
	{
		if(employeeobject!=null)
		{
			singletonlogger.info("object is already created");
			return 0;
		}
		singletonlogger.info("SingleTon design pattern");
		employeeobject=new Employee();
		singletonlogger.info("object is created");
		return 1;
	}
	public int settingName(String name)
	{
		employeeobject.setName(name);
		return 1;
	}
	public int settingDesination(String designation)
	{
		employeeobject.setDesignation(designation);
		return 1;
	}
	public int settingSalary(double salary)
	{
		employeeobject.setSalary(salary);
		return 1;
	}
	
	
	
	public int detailsPrint()
	{
		String details=employeeobject.toString();
		singletonlogger.debug("The employee details are {} ",details);
		return 1;
	}
	public double calculateBonus(double bonus)
	{
		double totalsalary=employeeobject.getSalary()+bonus;
		String name=employeeobject.getName();
		singletonlogger.info("The total salary of employee {} is {}",name,totalsalary);
		return totalsalary;
	}
	public int checkManager()
	{
		if((employeeobject.getDesignation()).equalsIgnoreCase("manager"))
		{
			singletonlogger.info("The  employee is a manager ");
			return 1;
		}
		else
		{
			singletonlogger.info("The  employee is  not a manager ");
			return 0;
		}
	}
}
