package sdbms;

public interface StudentManagementSystem
{	
	void addStudent();				
	void displayStudent();
	void displayAllStudents();
	void removeStudent();
	void removeAllStudents();
	void updateStudent();
	void countStudents();
	void sortStudents();
	void findStudentWithHighestMarks();
	void findStudentWithLowestMarks();
}

//All methods in Interface are default by Public and Abstract