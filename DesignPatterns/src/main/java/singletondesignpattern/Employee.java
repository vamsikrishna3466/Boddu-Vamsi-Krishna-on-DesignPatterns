package singletondesignpattern;

public class Employee {
	private String name="vamsi";
	private double salary=50000.00;
	private String designation="Manager";
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getDesignation()
	{
		return designation;
	}
	
	@Override
	public String toString()
	{
	return name+"\t"+salary+"\t"+designation;	
	}
}
