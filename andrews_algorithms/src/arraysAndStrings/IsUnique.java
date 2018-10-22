package arraysAndStrings;

public class IsUnique {

	public static void main(String args[]) {
		System.out.println(isUnique("abc"));
	}

	public static Boolean isUnique(String str) {
		Boolean[] bools = new Boolean[128];
		
		for(int i = 0; i < str.length(); i++) {
			int boolIndex = str.charAt(i);
			if(bools[boolIndex] != null) {
				return false;
			}
			
			bools[boolIndex] = true;
		}
		
		return true;
		
	}
}
