import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
	
		System.out.println("Please enter a integer to represent a star: ");
		Scanner scan = new Scanner(System.in);
		int numStars = scan.nextInt();
		
		for(int i = 1; i <= numStars; i++) {
			for(int j=0; j < i; j++) {
			System.out.print("*");
		}
			System.out.println();
		}
		
		for(int i = numStars; i > 0; i--) {
			for(int j=0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
