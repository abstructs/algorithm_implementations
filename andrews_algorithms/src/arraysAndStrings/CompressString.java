package arraysAndStrings;

public class CompressString {
	public static void main(String args[]) {
		System.out.println(compress("aabcccccaaa"));
		System.out.println(compress("aabccccqeqwwcaawewwwaqweqqqwwee"));
		
		System.out.println(compress("abcdefghiawbzc"));
	}
	
	public static String compress(String str) {
		boolean compress = false;
		int count = 1;
		char letter = str.charAt(0);
		
		StringBuilder builder = new StringBuilder();
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == letter) 
				count++;
			else {
				if(count > 1) 
					compress = true;
				
				builder.append(letter);
				builder.append(count);
				letter = str.charAt(i);
				count = 1;
			}
		}
		
		builder.append(letter);
		builder.append(count);
		
		if(compress) 
			return builder.toString();
		else 
			return str;
	}
}
