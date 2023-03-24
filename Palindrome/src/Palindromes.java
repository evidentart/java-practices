
public class Palindromes {

	public static void main(String[] args) {
		
		String original = "race car";
		String reverse = "";
		
		//get rid of space
		original = original.replace(" ", "");
		
		for(int i = original.length() -1; i >= 0; i--) {
			reverse += original.charAt(i);
			System.out.println(reverse);
		}
		
		boolean palindrome = true;
		for(int i = 0; i < original.length(); i++) {
			if(original.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println("PALINDROME!");
		}else {
			System.out.println("Not a palindrome!");
		}
	}

}
