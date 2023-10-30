package edbms;

import java.util.Scanner;

public class Solution
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to Employee Database");
		System.out.println("----------------------------");
		Scanner sc=new Scanner(System.in);
		EmployeeManagementSystem ems=new EmployeeManagementSystemImpl();

		while(true)
		{
			System.out.println("1.Add Employyw\n2.Display Employee\n3.Display All Employee's\n4.Remove Employee\n5.Remove All Employees\n6.Update Employee\n7.Count Employees\n8.Sort Employees\n9.Find Employee with HighestSalary\n10.Find Employee with LowestSalary\n11.Exit\n------------------------- ");

			int choice =sc.nextInt();

			switch(choice)
			{
			case 1:ems.addEmployee();
			break;
			case 2:ems.displayEmployee();
			break;
			case 3:ems.displayAllEmployees();
			break;
			case 4:ems.removeEmployee();
			break;
			case 5:ems.removeAllEmployees();
			break;
			case 6:ems.updateEmployee();
			break;
			case 7:ems.countEmployees();
			break;
			case 8:ems.sortEmployees();
			break;
			case 9:ems.findEmployeeWithHighestSalary();
			break;
			case 10:ems.findEmployeeWithLowestSalary();
			break;
			case 11:System.out.println("Thank you");
			System.exit(0);
			}
		}
	}
}
