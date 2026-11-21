package def;

import java.util.Scanner;

public class Birthday extends Organization {
    private boolean includeEntertainment;

    @Override
    public void calculate(double num) {
        super.calculate(num);

        if(includeEntertainment)
            super.price += 150;
    }

    @Override
    public void getInput() {
        Scanner scan = new Scanner(System.in);
        super.getInput();

        System.out.print("Do you want to include entertainment(Y/N): ");
        String s = scan.next();

        if(s.equalsIgnoreCase("Y"))
            includeEntertainment = true;
        else
            includeEntertainment = false;
    }

    @Override
    public String toString() {
        return "\nBirthday\n" + super.toString() + "Include Entertainment = " + includeEntertainment + "\n";
    }
}