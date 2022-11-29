package String_Operations;

public class String_Reverse_Keep_Digits_Intact {

	
	public static void main(String args[]) {
		
		String S1 = "abc123defg4567hijklmn8opqrstuvwxys890";		
		String S1_Reversed="";
		char a[];
		int s1_len = 0; 		
		s1_len=S1.length();		
		System.out.println("S1 Length: "+s1_len+"\nS2 Length: ");
		a=S1.toCharArray();		
		System.out.println("A Char array length:"+a.length+"\nB char array length: ");
		int count_a = a.length,i=0;
		count_a--;
		while(count_a>=0) {
			char c = a[count_a];
			if(Character.isAlphabetic(c)) {
				S1_Reversed += c;
			}
			else if(Character.isDigit(c)) {
				S1_Reversed +=c;
			}
			count_a--;
		}
		System.out.println("REversed String is : "+S1_Reversed);	
		
	}
	
}
