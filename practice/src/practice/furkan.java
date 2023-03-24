package practice;

import java.util.Random;
import java.util.Scanner;

public class furkan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter a sentence: ");
		
		scan.next();
		scan.close();
		
		Random num = new Random();
		
		int text = num.nextInt(5);
		
		System.out.println(text);
		
		if (text == 0) {
			System.out.println("Please enter a sentence: ");
		}else if(text == 1) {
			System.out.println("Good work ");
		}else if(text == 2) {
			System.out.print("Bad work ");
		}
		else if(text == 3) {
			System.out.print("Good job");
		}else if(text == 4) {
			System.out.print("Example");
		}
	}

}
