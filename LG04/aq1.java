package def;
import java.util.Scanner;

public class aq1 {
	
    public static void menu() {
        System.out.println("Menu\r\n"
                + "1. Is Relatively Prime\r\n"
                + "2. Is Perfect\r\n"
                + "3. Exit");
    }

    public static int isRelPrime(int n1, int n2) {
        if(n1 > n2) {
            for(int i = 2; i <= n2; i++)
                if(n1 % i == 0 && n2 % i == 0)
                    return 0;
        }
        else
            for(int i = 2; i <= n1; i++)
                if(n1 % i == 0 && n2 % i == 0)
                    return 0;
        return 1;
    }

    public static int isPerfect(int n1) {
        int i, sum = 1;
        for(i = 2; i < n1; i++)
            if(n1 % i == 0)
                sum += i;
        if(sum == n1)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        int cho = 10;
        Scanner scan = new Scanner(System.in);

        while(cho != 3)
        {
            menu();
            System.out.print("Enter your choice: ");
            cho = scan.nextInt();

            if(cho == 1)
            {
                System.out.print("Enter first number: ");
                int n1 = scan.nextInt();

                System.out.print("Enter second number: ");
                int n2 = scan.nextInt();

                int a = isRelPrime(n1, n2);
                if(a == 1)
                    System.out.println("Relatively Prime Numbers");
                else
                    System.out.println("NOT Relatively Prime Numbers");
            }
            else if (cho == 2)
            {
                System.out.println("Enter a number: ");
                int num = scan.nextInt();

                int b = isPerfect(num);
                if(b == 1)
                    System.out.println("Perfect Number");
                else
                    System.out.println("NOT Perfect Number");
            }
        }

    }

}
