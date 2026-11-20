package Q2;
import java.util.Scanner;

public class vitaminsMain_c {
	public static void main(String[] args) {
		vitamins vitamins1 = new vitamins();
		Scanner scan = new Scanner(System.in);
		
		vitamins1.getInput();
		System.out.println(vitamins1.toString());
	}
}
