package def;
import java.util.Scanner;

public class q2 {

    public static void menu() {
        System.out.println("MENU\r\n"
                + "**************************************\r\n"
                + "A. Add fractional parts of two numbers (maximum 4 decimal digits for each number)\r\n"
                + "B. Convert a double number to integer\r\n"
                + "C. QUIT");
    }

    public static double fracPart(double num) {
        num = num % 1;
        return num;
    }

    public static int roundNum(double num) {
        int intNum = (int) num;
        num = num %1;

        if(num >= 0.5)
            intNum++;
        
        return intNum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cho = "E";

        while (!cho.equals("C")) {
            menu();
            System.out.print("Enter your choice: ");
            cho = scan.next().toUpperCase();

            if(cho.equals("A")) {
                System.out.println("Enter two double numbers: ");
                double num1 = scan.nextDouble();
                double num2 = scan.nextDouble();

                num1 = fracPart(num1);
                num2 = fracPart(num2);
                System.out.printf("%.4f + %.4f = %.4f\n", num1, num2, num1 + num2);
            }
            else if(cho.equals("B")) {
                System.out.print("Enter a double number: ");
                double num1 = scan.nextDouble();

                int intNum = roundNum(num1);
                System.out.printf("The number %.4f converted to the integer number %d\n", num1, intNum);
            }
        }
    }
}