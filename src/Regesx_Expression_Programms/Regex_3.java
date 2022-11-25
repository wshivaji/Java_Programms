package Regesx_Expression_Programms;

import java.util.regex.Pattern;

public class Regex_3 {
	public static void main(String args[]) {
		
		System.out.println(Pattern.matches("[amr]", "asdf"));
		System.out.println(Pattern.matches("[amr]", "a"));
		System.out.println(Pattern.matches("[amr]", "amr"));
		System.out.println(Pattern.matches("[amr]", "mno"));
		System.out.println(Pattern.matches("[amr]", "rpg"));
		System.out.println(Pattern.matches("[amr]", "bns"));
		System.out.println(Pattern.matches("[amr]", "bcd"));
	}
}
