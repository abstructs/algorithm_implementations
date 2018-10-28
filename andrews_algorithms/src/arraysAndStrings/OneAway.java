package arraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class OneAway {
	public static void main(String args[]) {		
		System.out.println(oneAway("ple", "pale"));
		System.out.println(oneAway("pale", "pae"));
		System.out.println(oneAway("pale", "palle"));
		System.out.println(oneAway("pales", "palez"));
		System.out.println(oneAway("pales", "pale"));
		System.out.println(oneAway("ale", "bale"));
		System.out.println(oneAway("ooo", "ooop"));
		
		System.out.println(oneAway("pale", "bake"));
		System.out.println(oneAway("elap", "pale"));
		System.out.println(oneAway("elope", "cantelope"));
		
	}
	
	
	public static int notEquals(String str1, String str2 ) {
		int i = 0;
		int j = 0;
		int notEquals = 0;
		while(i < str1.length()) {
			if(j >= str2.length() || str1.charAt(i) != str2.charAt(j)) {
				notEquals++;
				i++;
				continue;
			}
			
			i++;
			j++;
		}
		
		return notEquals;
	}
	
	
	public static Boolean oneAway(String str1, String str2) {
		int timesNotEquals1 = notEquals(str1, str2);
		int timesNotEquals2 = notEquals(str2, str1);
		
		if(timesNotEquals1 <= timesNotEquals2) {
			return timesNotEquals1 <= 1;
		} else {
			return timesNotEquals2 <= 1;
		}
	}

}
