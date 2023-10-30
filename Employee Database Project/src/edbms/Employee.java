package edbms;

public class Employee
{
	private String id;
	private int age;
	private String name;
	private double salary;
	static int count=101;
	
	public Employee(int age,String name,double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		this.id="TYA"+count;
		count++;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setSalary(double salary)
	{
		this.salary=salary;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getId()
	{
		return id;
	}
	public String toString()
	{
		return "Employee ID id "+id+"Employee Name is "+name+"Age is "+age+"Salary is "+salary;
	}
}
