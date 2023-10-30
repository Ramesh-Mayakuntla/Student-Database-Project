package CustomSorting;

import java.util.Comparator;
import edbms.Employee;

public class SortEmployeeByName implements Comparator<Employee>
{

	@Override
	public int compare(Employee x, Employee y)
	{
		return x.getId().compareTo(y.getId());
	}
	
}
