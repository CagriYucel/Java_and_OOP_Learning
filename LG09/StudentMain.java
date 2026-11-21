package Q1;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentManagementSys.addStudent();
		
		System.out.println("Here is a list of the Students:");
		StudentManagementSys.display();
		
		System.out.print("------------------\r\n"
				+ "Avg of all Student GPA's:" + StudentManagementSys.calculateAverageGPA() + "\r\n");

		System.out.print("------------------\r\n"
				+ "Which student would you like to search? Enter his/her id: ");
		Student s = StudentManagementSys.searchStudent(scan.nextInt());
		
		while(s == null) {
			System.out.println("There is no such student in the array");
			System.out.print("Which student would you like to search? Enter his/her id: ");
			s = StudentManagementSys.searchStudent(scan.nextInt());
		}
		System.out.println("Here is the student you were looking for...\n" + s.toString());
	}
}
