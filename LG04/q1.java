package def;
import java.util.Scanner;

public class q1 {

    public static String machineChoice() {
        String[] characters = new String[]
                {
                        "p",
                        "r",
                        "s"
                };

        int ran = (int)(Math.random() * 3) + 1;

        return characters[ran-1];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cho = "A", ranStr;
        int score = 0;

        while (!cho.equals("q")) {
            System.out.print("Choose (p)aper, (r)ock, (s)cissor or (q)uit: ");
            cho = scan.next().toLowerCase();
            ranStr = machineChoice();

            if(cho.equals(ranStr))
                System.out.println("It's a tie! Your score: "+ score);
            else if(cho.equals("p"))
            {
                if(ranStr.equals("r"))
                {
                    score++;
                    System.out.println("The machine chooses rock. Paper covers rock. You win! Your score: "+ score);
                }
                else {
                    score = 0;
                    System.out.println("The machine chooses scissor. Scissor cuts paper. You lose! Your score: "+ score);
                }
            }
            else if(cho.equals("r"))
            {
                if(ranStr.equals("p"))
                {
                    score = 0;
                    System.out.println("The machine chooses paper. Paper covers rock. You lose! Your score: "+ score);
                }
                else {
                    score++;
                    System.out.println("The machine chooses scissor. Rock breaks scissor. You win! Your score: "+ score);
                }
            }
            else if(cho.equals("s"))
            {
                if(ranStr.equals("p"))
                {
                    score++;
                    System.out.println("The machine chooses paper. Scissor cuts paper. You win! Your score: "+ score);
                }
                else {
                    score = 0;
                    System.out.println("The machine chooses rock. Rock breaks scissor. You lose! Your score: "+ score);
                }
            }
        }
    }
}