package Regesx_Expression_Programms;

import java.util.regex.Pattern;

public class Regex_x_occurs_once_or_not_at_all {

	
	public static void main(String args[]) {
		System.out.println(Pattern.matches("[x?]", "abcd"));
		System.out.println(Pattern.matches("[x?]", "xyz"));
		System.out.println(Pattern.matches("[x?]", "x"));
		
		System.out.println(Pattern.matches("[x]?", "abcd"));
		System.out.println(Pattern.matches("[x]?", "xyz"));
		System.out.println(Pattern.matches("[x]?", "x"));
		
		System.out.println("*******************************************");
		System.out.println(Pattern.matches("[x+]", "abcd"));
		System.out.println(Pattern.matches("[x+]", "xxyz"));
		System.out.println(Pattern.matches("[x+]", "x"));
		
		System.out.println(Pattern.matches("[x]+", "abcd"));
		System.out.println(Pattern.matches("[x]+", "xxyz"));
		System.out.println(Pattern.matches("[x]+", "x"));
		
		System.out.println("*******************************************");
		System.out.println(Pattern.matches("[x*]", "abcd"));
		System.out.println(Pattern.matches("[x*]", "xxyz"));
		System.out.println(Pattern.matches("[x*]", "x"));
		
		System.out.println(Pattern.matches("[x]*", "abcd"));
		System.out.println(Pattern.matches("[x]*", "xxyz"));
		System.out.println(Pattern.matches("[x]*", "x"));
		
		System.out.println("*******************************************");
		System.out.println(Pattern.matches("[x{1}]", "abcd"));
		System.out.println(Pattern.matches("[x{1}]", "xxyz"));
		System.out.println(Pattern.matches("[x{1}]", "x"));
		
		System.out.println(Pattern.matches("[x]{1}", "abcd"));
		System.out.println(Pattern.matches("[x]{1}", "xxyz"));
		System.out.println(Pattern.matches("[x]{1}", "x"));
		
		
		System.out.println("*******************************************");
		System.out.println(Pattern.matches("[x{2}]", "abcd"));
		System.out.println(Pattern.matches("[x{2}]", "xxyz"));
		System.out.println(Pattern.matches("[x{2}]", "x"));
		
		System.out.println(Pattern.matches("[x]{2}", "abcd"));
		System.out.println(Pattern.matches("[x]{2}", "xxyz"));
		System.out.println(Pattern.matches("[x]{2}", "x"));
		System.out.println(Pattern.matches("[x]{2}", "xx"));
		System.out.println(Pattern.matches("x{2}", "xx"));
		System.out.println(Pattern.matches("x{2}", "xxx"));
		
	}
}
