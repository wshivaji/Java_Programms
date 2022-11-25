package Regesx_Expression_Programms;

import java.util.regex.Pattern;

public class Regex_verify_password_string_8_digit {

	
	//Create password verification REGEX length 8 digit (First capital digit/Second to Fifth small letter/Six to Eight number)
	
	public static void main(String args[]) {
	
		System.out.println(Pattern.matches("[A-Z]{1}[a-z]{4}[0-9]{3}", "Shiva123"));
		System.out.println(Pattern.matches("[A-Z]{1}[a-z]{4}[0-9]{3}", "Wshiv987"));
		System.out.println(Pattern.matches("[A-Z]{1}[a-z]{4}[0-9]{3}", "shivaji1"));
		System.out.println(Pattern.matches("[A-Z]{1}[a-z]{4}[0-9]{3}", "Magic456"));
		System.out.println(Pattern.matches("[A-Z]{1}[a-z]{4}[0-9]{3}", "difer789"));
	}
}
