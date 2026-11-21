package def;

import java.util.Scanner;

public class Wedding extends Organization {
    private String foodPackage;

    @Override
    public void calculate(double num) {
        // TODO Auto-generated method stub
        super.calculate(num);

        if(foodPackage.equalsIgnoreCase("Chicken"))
            super.price += 100;
        else
            super.price += 200;
    }

    @Override
    public void getInput() {
        Scanner scan = new Scanner(System.in);
        super.getInput();

        System.out.print("Enter food package(Chicken/Meat): ");
        this.foodPackage = scan.nextLine();
    }

    @Override
    public String toString() {
        return "\nWedding\n" + super.toString() + "Food Package = " + foodPackage + "\n";
    }
}
