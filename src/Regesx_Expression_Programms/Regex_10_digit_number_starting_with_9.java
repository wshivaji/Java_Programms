package Regesx_Expression_Programms;

import java.util.regex.Pattern;

public class Regex_10_digit_number_starting_with_9 {

	//Create REGEX to verify 10 digit number staring with 9
	public static void main(String args[]) {
		
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}", "8040306070"));
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}", "9137882111"));
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}", "6879832641"));
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}", "9860309497"));
		System.out.println(Pattern.matches("[9]{1}[0-9]{9}", "986321"));
		
	}
}
