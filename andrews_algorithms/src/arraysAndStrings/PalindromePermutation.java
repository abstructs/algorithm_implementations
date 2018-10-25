package arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
	public static void main(String args[]) {
		
		System.out.println(permHasPalindrome("AManAPlanACanalPanama".toLowerCase()));
		// shuffled up letters
		System.out.println(permHasPalindrome("ManPaaPnmAnAaAllanCaa".toLowerCase()));
		// more shuffled letters
		System.out.println(permHasPalindrome("naanmAPanllnMPaaaAaAC".toLowerCase()));
		System.out.println(permHasPalindrome("nopermpals".toLowerCase()));
	}
	
	public static Boolean permHasPalindrome(String str) {
		Map<Character, Integer> occurs = occurMap(str);
		
		boolean hasOdd = false;
		
		for(Integer value : occurs.values()) {
			if(value % 2 != 0) {
				if(hasOdd) return false;
				hasOdd = true;
			}
		}
		
		return true;
	}
	
	public static Map<Character, Integer> occurMap(String str) {
		Map<Character, Integer> occurs = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			if(occurs.containsKey(str.charAt(i))) {
				occurs.put(str.charAt(i), occurs.get(str.charAt(i)) + 1);
			} 
			else {
				occurs.put(str.charAt(i), 1);
			}
		}
		
		return occurs;
	}
}
