package Regesx_Expression_Programms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_1 {

	public static void main(String args[]) {
		//Method-1 
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean x = m.matches();
		
		//Method-2
		boolean y = Pattern.compile(".s").matcher("as").matches();
		
		//Method-3
		boolean z = Pattern.matches(".s", "as");
		
		System.out.println(x+" "+y+" "+z+" ");
	}
}
