package Q1;

public class radio {
	// data members
	private String name;
	private String type;
	private double frequency;

	// constructors
	public radio() {
		this.name = "Pal Fm";
		this.frequency = 92.4;
		this.type = "Nostalgia";
	}
	public radio(String name) {
		this.name = name;
	}

	public radio(String name, double frequency) {
		this.name = name;
		this.frequency = frequency;
	}

	public radio(String name, String type, double frequency) {
		this.name = name;
		this.frequency = frequency;
		this.type = type;
	}  

	// member methods
	public void display(){
		System.out.println("Name: " + name + "\nFrequency: " + frequency + "\nType: " + type);
	}

	// getters and setters
	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

}
