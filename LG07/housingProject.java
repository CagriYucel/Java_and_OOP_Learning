package Q3;
import java.util.Scanner;

public class housingProject {
	private String brand;
	private String city;
	private double price;
	private int numberOfPayment;
	private String housePlan;
	
	public housingProject() {
		
	}

	public housingProject(String brand, String city, double price, int numberOfPayment, String housePlan) {
		super();
		this.brand = brand;
		this.city = city;
		this.price = price;
		this.numberOfPayment = numberOfPayment;
		this.housePlan = housePlan;
	}

	public void getInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the brand: ");
		this.brand = scan.nextLine();
		
		System.out.print("Enter the city: ");
		this.city = scan.next();
		
		System.out.print("Enter the price: ");
		this.price = scan.nextDouble();
		
		System.out.print("Enter number of payments: ");
		this.numberOfPayment = scan.nextInt();
		
		System.out.print("Enter the house plan: ");
		this.housePlan = scan.next();
		
	}
	
	public void discount(int disPer) {
		this.price = this.price * (100 - disPer) / 100;
	}

	@Override
	public String toString() {
		return "housingProject:\n brand=" + brand + ",\n city=" + city + ",\n price=" + price + ",\n numberOfPayment="
				+ numberOfPayment + "\n, housePlan=" + housePlan;
	}
}
