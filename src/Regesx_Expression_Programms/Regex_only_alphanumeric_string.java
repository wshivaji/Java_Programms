package Regesx_Expression_Programms;

import java.util.regex.Pattern;

public class Regex_only_alphanumeric_string {

	
	//only alphanumeric string validation
	
	public static void main(String args[]) {
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "abcd12"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "shivaji123"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{9}", "Shivaji99"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{10}", "Wshivaji11"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{20}", "shviaji@gmail.com"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{20}", "007shivWankhede"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{18}", "SHIVAJIwankhede123"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{18}", "shivajiWANKHEDE123"));
		System.out.println(Pattern.matches("[a-zA-z0-9]{11}", "1986SHivaji"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{8}", "shivW123"));
	}
}
