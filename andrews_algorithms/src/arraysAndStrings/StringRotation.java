package arraysAndStrings;

public class StringRotation {
	public static void main(String args[]) {
		System.out.println(isRotation("waterbottle", "erbottlewat"));
		System.out.println(isRotation("waterbottle", "bottlewater"));
		System.out.println(isRotation("erbottlewat", "bottlewater"));
		System.out.println(isRotation("waterbottle", "rbottlewate"));
		System.out.println(isRotation("waterbottle", "waterbottel"));
		System.out.println(easyIsRotation("waterbottle", "water"));
		System.out.println();
		System.out.println(easyIsRotation("waterbottle", "erbottlewat"));
		System.out.println(easyIsRotation("waterbottle", "bottlewater"));
		System.out.println(easyIsRotation("erbottlewat", "bottlewater"));
		System.out.println(easyIsRotation("waterbottle", "rbottlewate"));
		System.out.println(easyIsRotation("waterbottle", "waterbottel"));
		System.out.println(easyIsRotation("waterbottle", "water"));
	}
	
	public static String slice(String str, int start, int end) {
		StringBuilder builder = new StringBuilder();
		for(int i = start; i < end; i++) {
			builder.append(str.charAt(i));
		}
		
		return builder.toString();
	}
	
	public static boolean isSubstring(String str1, String str2) {
		return str1.indexOf(str2) != -1;
	}
	
	public static boolean easyIsRotation(String str1, String str2) {
		return isSubstring(str2 + str2, str1);
	}
	
	public static boolean isRotation(String str1, String str2) {
		if(str1.length() != str2.length()) 
			return false;
		
		int head2 = 0;
		int check1 = 0;
		int check2 = 0;
		boolean flag = false;
		
		for(int i = 0; i < str2.length(); i++) {
			if(flag) {
				if(str1.charAt(check1) == str2.charAt(check2)) {
					check1++;
					check2++;
				}
				else {
					i = head2;
					check1 = 0;
					flag = false;
				}
			} 
			else {
				if(str1.charAt(0) == str2.charAt(i)) {
					flag = true;
					head2 = i;
					check2 = i + 1;
					check1 = 1;
				}
			}
		}
		
		return flag && isSubstring(str1, slice(str2, 0, head2));
	}
}
