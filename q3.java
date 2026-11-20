package lg3;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        String cho = "a";
        Scanner scan = new Scanner(System.in);

        while (!cho.equals("p"))
        {
            System.out.println("P. Play the number guessing game");
            System.out.println("E. Exit game");
            cho = scan.next().toLowerCase();

            if(cho.equals("p"))
            {
                System.out.print("Please guess a number between 1 and 10 : ");
                int userNum = scan.nextInt();
                int random = (int)(Math.random() * 10) + 1;

                if(random == userNum)
                    System.out.println("Congratulations, you have guessed number "+ random + "correctly.");
                else {
                    System.out.println("You couldn't guess correctly, the number is "+ random);
                    System.out.println("See you again next time.");
                }
            }
            else if (cho.equals("e"))
                System.out.println("Exit successful.");
            else
                System.out.println("Incorrect input!");
        }
    }
}