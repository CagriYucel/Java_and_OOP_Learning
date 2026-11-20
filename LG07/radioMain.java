package Q1;

public class radioMain {

	public static void main(String[] args) {
		
		radio r = new radio();		
		r.display();

		r.setFrequency(77.7);
		System.out.println("\nFrequency of the object is " + r.getFrequency());
	}
}
