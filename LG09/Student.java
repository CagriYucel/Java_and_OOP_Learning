package Q1;
import java.util.Scanner;

public class Student {

	private String name;
	private int id;
	private double gpa;
	private boolean hasScholarship;
	
	public Student() {
	}

	// getters and setters
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public double getGpa() {
		return gpa;
	}

	public boolean getScholarship() {
		return hasScholarship;
	}

	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		name = scanner.nextLine();
		System.out.print("Enter Student Gpa: ");
		gpa = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Does student has scholarship? (Y/N): ");
		String scholar = scanner.nextLine();
		if(scholar.equalsIgnoreCase("Y"))
			this.hasScholarship = true;
		else if(scholar.equalsIgnoreCase("N"))
			this.hasScholarship = false;
	}

	@Override
	public String toString() {
		String a ="";
		if(hasScholarship == true) {
			a += "Student has scholarship.";
		}else {
			a+= "No scholarship.";
		}
		return "Student Name=" + name 
				+ ",\n Id=" + id 
				+ ",\n Gpa=" + gpa 
				+ ",\n Scholarship Status=" + a + "\n";
	}
}