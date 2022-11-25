package Regesx_Expression_Programms;

import java.util.regex.Pattern;

public class Regex_2 {

	public static void main(String args[]) {
		
		System.out.println(Pattern.matches(".s", "As"));
		System.out.println(Pattern.matches(".s", "msk"));
		System.out.println(Pattern.matches(".s", "amms"));
		System.out.println(Pattern.matches(".s", "asdf"));
		System.out.println(Pattern.matches(".s", "aas"));
		System.out.println(Pattern.matches(".s", "ws"));
		
	}
}
