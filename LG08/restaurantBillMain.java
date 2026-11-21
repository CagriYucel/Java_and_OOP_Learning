package Q1;
import java.util.Scanner;

public class restaurantBillMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		restaurantBill bill;
		
		System.out.print("Do you want to check the bill (Yes/No): ");
		input = scanner.next();
		
		while (input.equalsIgnoreCase("yes")) {
			bill = new restaurantBill(); 
			bill.getInput(); 
			
			bill.calculateBill(); 
			System.out.println("\nThe bill is " + bill.getPrice() + " TL");
			
			System.out.print("\nDo you want to check the bill (Yes/No): ");
			input = scanner.next();
		}
        System.out.print("\nThere are " + restaurantBill.getCountOfBills() + " bills.");
	}

}
