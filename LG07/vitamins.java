package Q2;
import java.util.Scanner;

public class vitamins {

	private String name;
	private int numOfCapsul;
	private String brand;
	private int codeNumber;

	public vitamins() {
		name = "No Name";
		brand = "No Brand";
	}

	public vitamins(String name, int numOfCapsul, String brand, int codeNumber) {
		this.name = name;
		this.numOfCapsul = numOfCapsul;
		this.brand = brand;
		this.codeNumber = codeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfCapsul() {
		return numOfCapsul;
	}

	public void setNumOfCapsul(int numOfCapsul) {
		this.numOfCapsul = numOfCapsul;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCodeNumber() {
		return codeNumber;
	}

	public void setCodeNumber(int codeNumber) {
		this.codeNumber = codeNumber;
	}

	@Override
	public String toString() {
		return "\nVitamin Info:" + 
				"\nName= " + name + 
				"\nNumOfCapsul= " + numOfCapsul + 
				"\nBrand= " + brand + 
				"\nCodeNumber= " + codeNumber;
	}
	
	public void getInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		this.setName(scan.nextLine());
		
		System.out.print("Enter Brand Name: ");
		this.setBrand(scan.nextLine());
		
		System.out.print("Enter the Number of Capsule: ");
		this.setNumOfCapsul(scan.nextInt());
		
		System.out.print("Enter the Code number: ");
		this.setCodeNumber(scan.nextInt());
	}
}
