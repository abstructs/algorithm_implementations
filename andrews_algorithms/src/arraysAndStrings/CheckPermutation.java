package arraysAndStrings;

import java.util.ArrayList;

public class CheckPermutation {
	
	public static void main(String args[]) {
		System.out.println(isPermSlow("abc", "ab"));
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
