package Q3;
import java.util.Scanner;

public class housingProjectMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		housingProject hp1 = new housingProject();
		String cho = "yes";
		
		while(!cho.equalsIgnoreCase("no"))
		{
			System.out.println("Do you want to add Housing Project (Yes/No):");
			cho = scan.next();
		
			if(cho.equalsIgnoreCase("yes")) {
				hp1.getInput();
		
				System.out.print("Enter the discount percentage: ");
				hp1.discount(scan.nextInt());
			
				System.out.println("Price after discount:");
				System.out.println(hp1.toString());
			}
		}
		System.out.println("Program terminated");
	}

}
