package CustomSorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeBySalary implements Comparator<Employee>
{
	@Override
	public int compare(Employee a,Employee b)
	{
		Double d1=a.getSalary();
		Double d2=b.getSalary();
		return (int)(d1-d2);
		
	//	return (int)(a.getSalary()-b.getSalary());
	}
}
