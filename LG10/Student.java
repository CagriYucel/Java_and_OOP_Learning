package Q1;

public class Student {
    private String name;
    private int id;
    private double gpa;
    private boolean hasScholarship;

    // Constructor that takes input parameters directly
    public Student(String name, int id, double gpa, boolean hasScholarship) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.hasScholarship = hasScholarship;
    }

    // Getters and setters
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

    @Override
    public String toString() {
        String a = "";
        if(hasScholarship) {
            a += "Student has scholarship.";
        } else {
            a += "No scholarship.";
        }
        return "Student Name=" + name 
                + ",\n Id=" + id 
                + ",\n Gpa=" + gpa 
                + ",\n Scholarship Status=" + a + "\n";
    }
}