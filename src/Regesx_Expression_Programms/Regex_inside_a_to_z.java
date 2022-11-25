package Regesx_Expression_Programms;

import java.util.regex.Pattern;

public class Regex_inside_a_to_z {

	public static void main(String args[]) {
		
		System.out.println(Pattern.matches("[a-zA-Z]","ssb"));
		System.out.println(Pattern.matches("[a-zA-Z]", "ABCD"));
		System.out.println(Pattern.matches("[a-zA-Z]", "az"));
		System.out.println(Pattern.matches("[a-zA-Z]", "0123"));
		System.out.println(Pattern.matches("[a-zA-Z]", "ab"));
		System.out.println(Pattern.matches("[a-zA-Z]", "yz"));
		System.out.println(Pattern.matches("[a-zA-Z]", "ba"));
		System.out.println(Pattern.matches("[a-zA-Z]", "z"));
		System.out.println(Pattern.matches("[a-zA-Z]", "wxy"));
		System.out.println(Pattern.matches("[a-zA-Z]", "q"));
		System.out.println(Pattern.matches("[a-zA-Z]", "f"));
		System.out.println(Pattern.matches("[a-zA-Z]", "R"));
		System.out.println(Pattern.matches("[a-zA-Z]", "L"));
		
		
		System.out.println(Pattern.matches("[a-z]", "O"));
		System.out.println(Pattern.matches("[a-z]", "o"));
		System.out.println(Pattern.matches("[a-z]", "ab"));
		System.out.println(Pattern.matches("[a-z]", "xyz"));
		System.out.println(Pattern.matches("[a-z]", "mnop"));
	}
}
