package arraysAndStrings;
import java.util.Arrays;

public class URLify {
	public static void main(String args[]) {
		String str = "Mr John Smith Is Awesome";
		
		int spaceCount = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		
//		System.out.println(spaceCount * 2 + str.length());
		
		char[] chars = new char[spaceCount * 2 + str.length() + 1];
		
		for(int i = 0; i < str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		
		System.out.println(urlify(chars, str.length()));
	}
	
	public static char[] urlify(char[] chars, int trueLength) {
		int sV = 0;
		
		for(int i = 0; i < trueLength; i++) {
			if(chars[i + sV] == ' ') {
				char c1 = chars[i + sV + 1];
				char c2 = chars[i + sV + 2];
				for(int j = i + sV + 3; j < trueLength + sV + 2; j += 2) {
					char t1 = chars[j];
					char t2 = chars[j + 1];
					
					chars[j] = c1;
					chars[j + 1] = c2;
					c1 = t1;
					c2 = t2;
				}
				
				chars[i + sV] = '%';
				chars[i + sV + 1] = '2';
				chars[i + sV + 2] = '0';
				sV += 2;
			}
		}
		
		return chars;
	}
}
