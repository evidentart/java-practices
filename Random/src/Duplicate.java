import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
	
		String sentence = "How many duplicates are there?";
		System.out.println(sentence);
		
		String characters = "";
		String duplicates = "";
		for (int i = 0; i < sentence.length(); i++) {
			String current = Character.toString(sentence.charAt(i));
			if(characters.contains(current)) {
				if(!duplicates.contains(current)) {
					duplicates += current + ",";
				}
				
			}
			characters += current;	
		}	
		System.out.println(duplicates);
		
		// age calculator
		System.out.println("age calculate: ");
		
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(2014, 07, 22);
		int years = Period.between(birthDate, today).getYears();
		
		System.out.println(today);
		System.out.println(birthDate);
		System.out.println(years);
		
		
		
		//find prime 
		
		Scanner scan = new Scanner(System.in);
		System.out.println(findPrimes(1, 100));
		}
		
		public static ArrayList<Integer> findPrimes(int start, int end) {
			
			ArrayList<Integer> primes = new ArrayList<Integer>();
			
			for(int n = start; n < end; n++) {
				boolean prime = true;
				int i = 2;
				while(i <= n/2) {
					if(n % i ==0) {
						prime = false;
						break;
				}
				i++;
			
			}
			if(prime) {
				primes.add(n);
			}
				
				
			}	
	
			
			return primes;
		
	}		
}
