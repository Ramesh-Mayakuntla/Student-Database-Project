package sdbms;
import java.util.Scanner;

public class Solution
{

	public static void main(String[] args)
	{
		System.out.println("Welcome To DataBase Management System");
		System.out.println("-------------------------------------");

		Scanner sc=new Scanner(System.in);

		StudentManagementSystem sms=new StudentManagementSystemImpl();				//Upcasting is done inorder to achieve Abstraction

		while(true)
		{
			System.out.println("1.Add Student\n2.Display Student\n3.Display All Students\n4.Remove Student\n5.Remove All Students\n6.Update Student\n"
					+ "7.Count Students\n8.Sort Students\n9.findStudentWithHighestMarks\n10.findStudentWithLowestMarks\n11.Exit\n------------------\nEnter Your Choice\n------------------");

			int choice=sc.nextInt();

			switch(choice)
			{
			case 1: sms.addStudent();
			break;

			case 2: sms.displayStudent();
			break;

			case 3: sms.displayAllStudents();
			break;

			case 4: sms.removeStudent();
			break;

			case 5: sms.removeAllStudents();
			break;

			case 6: sms.updateStudent();
			break;

			case 7: sms.countStudents();
			break;

			case 8: sms.sortStudents();
			break;

			case 9: sms.findStudentWithHighestMarks();
			break;

			case 10: sms.findStudentWithLowestMarks();
			break;

			case 11: System.out.println("Thank you!!!!!!!!!!");
			System.exit(0);
			}
			System.out.println("-------------------------------------");
		}
	}

}
