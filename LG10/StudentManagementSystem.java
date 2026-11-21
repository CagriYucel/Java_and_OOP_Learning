package Q1;

public class StudentManagementSystem {
    private static final int MAX_CAPACITY = 5;
    private static Student[] students = new Student[MAX_CAPACITY];
    private static int count = 0;

    public static String addStudent(String name, int id, double gpa, boolean hasScholarship) {
    	String a="";
        if (count >= MAX_CAPACITY) {
            a+=("Maximum capacity of students reached.");
            return a;
        }

        if (searchStudentById(id)) {
        	a+=("Student ID already exists. Please enter a different ID.");
             return a;
        }

        students[count++] = new Student(name, id, gpa, hasScholarship);
        a+=("Student added successfully!");
        return a;
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
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    public static String display() {
        String output = "";
        if (count == 0) {
            System.out.println("No students to display.");
        } else {
            for (int i = 0; i < count; i++) {
                output += students[i].toString() + "\n";
            }
        }
        return output;
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