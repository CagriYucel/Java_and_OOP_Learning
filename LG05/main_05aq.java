package AQ;
import java.util.Scanner;

public class main_05aq {

    public static int menu()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("DISPLAY\r\n"
                + "1. All numbers\r\n"
                + "2. Even numbers\r\n"
                + "3. Subscripts (indices) of odd numbers\r\n"
                + "4. The numbers with even subscripts\r\n"
                + "5. Minimum number\r\n"
                + "6. Subscript of maximum number\r\n"
                + "7. Exit");

        int cho = 0;
        while(cho < 1 || cho > 7)
        {
            System.out.print("Enter your choice:");
            cho = scan.nextInt();
        }
        return cho;
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        int cho = 0, i = 0;
        int[] arr = new int[100];
        int size = 0;
        int num;

        System.out.print("Enter the elements of the array: ");

        while (size < 100) {
            num = scan.nextInt();

            if (num == 0)
                break;

            arr[size] = num;
            size++;
        }
        while (cho != 7) {
        	cho = menu();
        	if(cho == 1) {
        		System.out.println("All numbers\r\n"
        				+ "************");
        		for (i = 0; i < size; i++) {
        			System.out.print(arr[i] + " ");
        		}
        		System.out.println("\n");
        	}
        	else if(cho == 2) {
        		System.out.println("Even numbers\r\n"
        				+ "************");
        		for (i = 0; i < size; i++) {
        			if (arr[i] % 2 == 0)
        				System.out.print(arr[i] + " ");
        		}
        		System.out.println("\n");
        	}
        	else if(cho == 3) {
        		System.out.println("Subscripts of odd numbers\r\n"
        				+ "*************************");
        		for (i = 0; i < size; i++) {
        			if (arr[i] % 2 != 0) {
        				System.out.printf("%d ", i);
        			}
        		}
        		System.out.print("\n");
        	}
        	else if(cho == 4) {
        		System.out.println("\nThe numbers with even subscripts");
        		System.out.println("********************************");
        		
        		for (i = 0; i < size; i++) {
        			if (i % 2 == 0) {
        				System.out.printf("%d ", arr[i]);
        			}
        		}
        		System.out.println("\n");
        	}
        	else if(cho == 5) {
        		System.out.println("\nMinimum number");
        		System.out.println("**************");
        		
        		if (size > 0) {
        			
        			int minimum = arr[0];
        			
        			for (i = 1; i < size; i++) {
        				if (arr[i] < minimum) {
        					minimum = arr[i];
        				}
        			}
        			System.out.printf("%d", minimum);
        			System.out.println();
        		}
        		System.out.println();
        	}
        	else if(cho == 6) {
        		System.out.println("\nSubscript of maximum number");
        		System.out.println("***************************");
        		
        		if (size > 0) {
        			int max = arr[0], sum = 0;
        			
        			for (i = 1; i < size; i++) {
        				if (arr[i] > max) {
        					 max = arr[i];
        				}
        			}
        			
        			do {
        				sum += max % 10;
        				max /= 10;
        			} while (max > 0);
        			
        			System.out.printf("%d", sum);
        			System.out.println();
        		}
        		System.out.println();
        	}
        }
    }
}