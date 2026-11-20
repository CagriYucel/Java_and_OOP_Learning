package lg3;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        int deadCount = 0, cho = 0;
        double total = 0, pay;
        String dead = "a";

        Scanner scan = new Scanner(System.in);

        while (cho != 4)
        {
        pay = 0;
        System.out.print("TRAFFIC PENALTY PAYMENTS\r\n"
                + "------------------------\r\n"
                + "1. Speed Limit Violation\r\n"
                + "2. Red Light Violation\r\n"
                + "3. Parking Violation\r\n"
                + "4. EXIT\n");
        System.out.println("Enter the penalty article no: ");
        cho = scan.nextInt();

        if(cho <= 3 && cho >= 1)
            {
            System.out.println("payment before deadline (y/n)?");
            dead = scan.next().toLowerCase();

            if(dead.equals("n"))
            {
                if(cho == 1)
                    pay = 2167.0;
                else if(cho == 2)
                    pay = 1506.0;
                else
                    pay = 993.0;
            }
            else if (dead.equals("y"))
            {
                deadCount++;

                if(cho == 1)
                    pay = 2167.0 * 3 / 4;
                else if(cho == 2)
                    pay = 1506.0 * 3 / 4;
                else
                    pay = 993.0 * 3 / 4;
            }
            System.out.println("Payment Amount: "+ pay);
            total += pay;
        }
        }
        System.out.println("Penalty totals: "+ total);
        System.out.println(deadCount + " people paid the penalty before the deadline");
    }
}