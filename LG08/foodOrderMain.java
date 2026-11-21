package Q2;
import java.util.Scanner;

public class foodOrderMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		String input, useCoupon;
		foodOrder order;
		
		System.out.print("Do you want to place an order? (Yes/No): ");
		input = scanner.next();
		
		while (input.equalsIgnoreCase("yes")) {
			order = new foodOrder();
			order.getInput();
			
			if(foodOrder.checkForCoupons()) {
				System.out.println("\nCongratulations! You won a coupon!");
			}
			if(foodOrder.getCouponCount() > 0) {
				System.out.println("\nDo you want to use a coupon? (Yes/No):");
				
				useCoupon = scanner.next();
				
				if(useCoupon.equalsIgnoreCase("yes"))
				{
					order.applyCoupon();
					System.out.println(order);
				}	
			}
			System.out.print("\nDo you want to place an order? (Yes/No): ");
			input = scanner.next();
		}
		System.out.print("\nYou have made " + foodOrder.getOrderCount() + " orders.");
		System.out.println("\nYou have " + foodOrder.getCouponCount() + " coupons left.");
	}
}