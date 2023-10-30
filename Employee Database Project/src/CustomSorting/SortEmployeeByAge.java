package CustomSorting;

import java.util.Comparator;

import edbms.Employee;

public class SortEmployeeByAge implements Comparator<Employee>
{
	@Override
	public int compare(Employee a,Employee b)
	{
		
		Integer age1=a.getAge();
		Integer age2=b.getAge();
		return age1-age2;
		
	//	return a.getAge()-b.getAge();
	}
}
