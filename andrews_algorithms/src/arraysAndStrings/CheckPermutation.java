package arraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckPermutation {
	
	public static void main(String args[]) {
		System.out.println(isPermFast("abc", "bac"));
		
	}
	
	public static Boolean isPermFast(String str1, String str2) {
		return getOccurs(str1).equals(getOccurs(str2));
	}
	
	public static HashMap<Character, Integer> getOccurs(String str) {
		HashMap<Character, Integer> occurs = new HashMap<Character, Integer>();
		for(int i = 0; i < str.length(); i++) {
			Character key = str.charAt(i);
			Integer value = occurs.get(key);
			
			if(occurs.containsKey(key)) {
				occurs.put(key, value + 1);
			} 
			else {
				occurs.put(key, 0);
			}
		}
		
		return occurs;
	}
	
	public static Boolean isPermSlow(String str1, String str2) {
		ArrayList<String> perms = perm(str1);
		return perms.contains(str2);
	}
	
	public static ArrayList<String> perm(String str) {
		if(str.length() == 1) {
			ArrayList<String> strList = new ArrayList<String>();
			strList.add(str);
			return strList;
		}
		
		ArrayList<String> tailPerms = perm(str.substring(1));
		ArrayList<String> perms = new ArrayList<String>();
		
		for(int i = 0; i < tailPerms.size(); i++) {
			for(int j = 0; j < str.length(); j++) {
				int carry = 0;
				perms.add(j, "");
				for(int k = 0; k < str.length(); k++) {
					if(j == k) {
						perms.set(j, perms.get(j) + str.charAt(0));
						carry = 1;
						continue;
					}
					perms.set(j, perms.get(j) + tailPerms.get(i).charAt(k - carry));
				}
			}
		}
		
		return perms;
	}
	
}
