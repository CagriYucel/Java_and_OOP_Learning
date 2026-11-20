package lg3;
import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter worked hour: ");
        int workHour = scan.nextInt();
        double salary;

        if (workHour <= 35)
            salary = 10.00 * workHour;
        else
            salary = 220.00 + 16 * (workHour - 35);
        System.out.printf("Amount of the salary to be paid: %.2f", salary);
    }

}
