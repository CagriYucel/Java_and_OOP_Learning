package lg3;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        String type = "a";
        Scanner scan = new Scanner(System.in);

        while (type.equals("h") && type.equals("p") && type.equals("e"))
        {
        System.out.println("H. Hardcover");
        System.out.println("P. Paperback");
        System.out.println("E. EBook");

        System.out.print("Enter the type of book(H/h: Hardcover, P/p: Paperback, E/e: EBook): ");
        type = scan.next().toLowerCase();
        }

        System.out.print("How many books do you want to enter: ");
        int count = scan.nextInt();
        double vat = 0, cost = 0;

        for(int i = 0; i < count; i++)
        {
            System.out.print("Enter "+ (i + 1)+". item's cost in TL: ");
            double price = scan.nextDouble();
            cost += price;
            if (type.equals("h"))
                vat += price * 12 / 100;
            else if (type.equals("p"))
                vat += price * 8 / 100;
            else
                vat += price * 20;
        }
        System.out.println("Total cost: "+ cost +" TL");
        System.out.println("Total VAT: "+ vat +" TL");
    }

}