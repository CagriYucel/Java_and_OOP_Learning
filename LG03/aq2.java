package lg3;
import java.util.Scanner;

public class aq2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int first, second, transfer, week, i = 0, move = 0;
		
		System.out.println("Enter the number of books on the 1st floor:");
		first = scan.nextInt();
		
		System.out.println("Enter the number of books on the 2nd floor:");
		second = scan.nextInt();
		
		System.out.println("Enter the number of books to be transferred:");
		transfer = scan.nextInt();
		
		System.out.println("Enter the number of weeks:");
		week = scan.nextInt();
		
		System.out.print("WEEK 1st Floor 2nd Floor MOVED\r\n"
				+ "**********************************\n");
		
		while(i <= week || second >= 0)
		{
			System.out.printf("%d %d %d %d\n", i, first, second, move);
			move += transfer;
			first += transfer;
			second -= transfer;
			
		}
		
		if (i != week || second != 0)
			System.out.println("There are not enough books to move on the 2nd floor!");
	}

}
