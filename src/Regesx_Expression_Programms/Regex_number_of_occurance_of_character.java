package Regesx_Expression_Programms;

import java.util.regex.Pattern;

public class Regex_number_of_occurance_of_character {
	 public static void main(String args[]) {
		 System.out.println(Pattern.matches("[s]?", "s"));
		 System.out.println(Pattern.matches("[amn]?", "apple"));
		 System.out.println(Pattern.matches("[abcd]+", "apple"));
		 System.out.println(Pattern.matches("[abcd]", "a"));
		 System.out.println(Pattern.matches("[abcd]","b"));
		 System.out.println(Pattern.matches("[abcd]","c"));
		 System.out.println(Pattern.matches("[abcd]","d"));
		 System.out.println(Pattern.matches("[abcd]+", "aaabbc"));
		 System.out.println(Pattern.matches("[abcd]+", "accbbddaaa"));
		 
	 }
}
