package def;

import java.util.Scanner;

public class OrganizationMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hourlyPrice;

        Wedding w = new Wedding();
        w.getInput();

        System.out.print("Enter hourly price of the wedding: ");
        hourlyPrice = scan.nextDouble();
        w.calculate(hourlyPrice);

        System.out.println(w);

        Birthday b = new Birthday();
        b.getInput();

        System.out.print("Enter hourly price of the birthday: ");
        hourlyPrice = scan.nextDouble();
        b.calculate(hourlyPrice);

        System.out.println(b);
    }
}