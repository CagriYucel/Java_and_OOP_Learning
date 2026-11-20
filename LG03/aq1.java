package lg3;

import java.util.Scanner;

public class aq1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int saver = 0;

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter ID and salary of a worker: ");
            int id = scan.nextInt();
            double salary = scan.nextDouble();

            if(salary <= 40000)
                salary = salary * 1125 / 1000;
            else
                salary = salary * 111 / 100;

            String save = "a";
            System.out.println("Is the worker a member of the savement box (Y for yes, N for no): ");
            save = scan.next().toLowerCase();

            if(save.equals("y"))
            {
                salary = salary * 87 / 100;
                saver++;
                total += salary * 13 / 100;

                System.out.println("Worker ID: "+ id);
                System.out.printf("New Salary: %.2f\n", salary);
            }
            else if(save.equals("n"))
            {
                System.out.println("Worker ID: "+ id);
                System.out.printf("New Salary: %.2f\n", salary);
            }
            else
                System.out.print("Invalid character");
        }
        System.out.println(saver +" workers are members of the savement box.");
        System.out.printf("%.2f TL has been saved in the box", total);
    }
}