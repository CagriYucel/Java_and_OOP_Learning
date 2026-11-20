package Q1;
import java.util.Scanner;

public class main_05q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, sum = 0;
        int[] arr = new int[5];

        System.out.println("Enter 5 integer numbers:");
        for(i = 0; i < 5; i++)
        {
            arr[i] = scan.nextInt();
            sum+= arr[i];
        }
        double avg = sum * 1.0 / arr.length;

        System.out.println("The array content:");
        for(i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");

        System.out.printf("\n\nSum of the numbers: %d. Average of the numbers: %.2f\n\n", sum, avg);
        System.out.println("index number diff. to avg\r\n"
                + "----- ------ ------------");

        for (i = 0; i < 5; i++)
            System.out.printf("%5d %7d %10.2f\n", i, arr[i], arr[i] - avg);
    }

}

