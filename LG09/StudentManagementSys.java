package Q1;
import java.util.Scanner;

public class StudentManagementSys {
	private static final int MAX_CAPACITY = 5;
	private static Student[] students = new Student[MAX_CAPACITY];
	private static int count = 0;

	public static void addStudent() {
		Scanner scanner = new Scanner(System.in);
		while (count < MAX_CAPACITY) {
			Student s = new Student();
			System.out.print("Enter Student Id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			if (searchStudentById(id)) {
				System.out.println("Student ID already exists. Please enter a different ID.");
				continue;
			}
			s.setId(id);
			s.getInput();

			students[count++] = s;
			System.out.println("Student added successfully!");

			System.out.print("Do you want to add another student? (Y/N): ");
			String response = scanner.nextLine();

			if (response.equalsIgnoreCase("N")) {
				break;
			}
			if (count == MAX_CAPACITY) {
				System.out.println("Maximum capacity of students reached.");
				break;
			}
		}
	}

	public static boolean searchStudentById(int id) {
		for (int i = 0; i < count; i++) {
			if (students[i].getId() == id) {
				return true;
			}
		}
		return false;
	}

	public static Student searchStudent(int id) {
		Student foundStudent = null;

		for (int i = 0; i < count; i++) {
			if (students[i].getId() == (id)) {
				foundStudent = students[i];
				return foundStudent;
			}
		}
		return null;
	}

	public static void display() {
		String output="";

		if (count == 0) {
			System.out.println("No students to display.");
		} else {
			for (int i = 0; i < count; i++) {
				output +=  students[i].toString()+ "\n";
			}
		}
		System.out.println(output);
	}

	public static double calculateAverageGPA() {
		if (count == 0) {
			return 0;
		}
		double totalGpa = 0;
		for (int i = 0; i < count; i++) {
			totalGpa += students[i].getGpa();
		}
		return totalGpa / count;
	}
}