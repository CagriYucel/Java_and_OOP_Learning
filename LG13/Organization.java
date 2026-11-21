package def;
import java.util.Scanner;

public class Organization {
    protected String companyName;
    protected String ownerName;
    protected double price;
    protected int duration;

    public void calculate(double num) {
        price = duration * num;
    }

    public void getInput() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Company Name: ");
        this.companyName = scan.nextLine();

        System.out.print("Enter owner name: ");
        this.ownerName = scan.nextLine();

        System.out.print("Enter the organization duration: ");
        this.duration = scan.nextInt();
    }

    @Override
    public String toString() {
        return "Organization\nCompany Name = " + companyName + "\nOwner Name = " + ownerName + "\nPrice = " + price
                + "\nDuration = " + duration + "\n";
    }

}