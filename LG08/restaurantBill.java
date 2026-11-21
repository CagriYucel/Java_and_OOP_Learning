package Q1;
import java.util.Scanner;

public class restaurantBill {
	private String menuItem;
	private int tableNo;
	private double size;
	private double price;
	
	private static final double BEEF = 310;
	private static final double CHICKEN = 200;
	private static int countOfBills= 0;
	
	public restaurantBill() {
		menuItem = "No item";
		countOfBills++;
	}
	
	public static int getCountOfBills() {
		return countOfBills;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void getInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nEnter the table number: ");
		tableNo = scanner.nextInt();
		scanner.skip("\\R");
		
		System.out.print("\nEnter the menu items's name: ");
		menuItem = scanner.nextLine();
		System.out.print("Enter the size in grams: ");
		size = scanner.nextDouble();
		
	}
	public void calculateBill() {
		if (menuItem.equalsIgnoreCase("Chicken Wrap")){
			price = CHICKEN;
			if(size == 120)
				price *= 1.4;
			else if(size == 180)
				price *= 1.7;
		}
		else if(menuItem.equalsIgnoreCase("Beef Wrap")) {
			price = BEEF;
			if(size == 120)
				price *= 1.4;
			else if(size == 180)
				price *= 1.8;
		}
	}
	@Override
	public String toString() {
		return "RestaurantBill"
			+ "\nTable Number=" + tableNo
			+ "\nMenu Item=" + menuItem 
			+ "\nSize=" + size
			+ "\nPrice=" + price;
	}
}
