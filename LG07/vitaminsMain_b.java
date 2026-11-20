package Q2;
import java.util.Scanner;

public class vitaminsMain_b {
	public static void main(String[] args) {
		vitamins vitamins1 = new vitamins();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		vitamins1.setName(scan.nextLine());
		
		System.out.print("Enter Brand Name: ");
		vitamins1.setBrand(scan.nextLine());
		
		System.out.print("Enter the Number of Capsule: ");
		vitamins1.setNumOfCapsul(scan.nextInt());
		
		System.out.print("Enter the Code number: ");
		vitamins1.setCodeNumber(scan.nextInt());
		
		System.out.println(vitamins1.toString());
	}
}
