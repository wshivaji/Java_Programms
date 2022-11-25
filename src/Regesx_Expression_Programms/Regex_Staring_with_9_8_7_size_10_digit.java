package Regesx_Expression_Programms;

import java.util.regex.Pattern;

public class Regex_Staring_with_9_8_7_size_10_digit {

	//Create REGEX to verify number starting with 9/8/7 size 10 digits
	
	public static void main(String args[]) {
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9863247812"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7847845789"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "3269845878"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7487898612"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9846123641"));
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "8648798316"));
	}
}
