package Q2;
import java.util.Scanner;

public class foodOrder {
	
	// data members
	private String restaurant;
	private String item;
	private double price;
	
	private static int orderCount = 0;
	private static int couponCount = 0;
	
	private static final double COUPON = 30;

	// no-arg constructor
	public foodOrder() {
		restaurant = "No Name";
		orderCount++;
	}

	// member methods
	public static int getOrderCount() {
	    return orderCount;
	}
	
	public static int getCouponCount() {
	    return couponCount;
	}
	
	public void applyCoupon() {
		if(price > COUPON)
		{
			price -= COUPON;
			couponCount--;
		
		}
	}
	
	public static boolean checkForCoupons() {
		if(orderCount % 2 == 0) {
			couponCount++;
			return true;
		}
		else return false;
			
	}
	
	public void getInput() {
	    Scanner scanner = new Scanner(System.in);
	
	    System.out.print("\nEnter restaurant: ");
	    restaurant = scanner.nextLine();
	    System.out.print("Enter the ordered item: ");
		item = scanner.nextLine();
		System.out.print("Enter the price of the item: ");
		price = scanner.nextDouble();
	}

	@Override
	public String toString() {
	    return "Food Order"
			+ "\nRestaurant= " + restaurant
			+ "\nItem= " + item
			+ "\nprice= " + price + " TL";
			
	}
}
