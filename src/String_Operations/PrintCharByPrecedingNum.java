package String_Operations;

public class PrintCharByPrecedingNum {

	public static void main(String args[]) {
		
		String str = "a2b3c4d5e6f7";
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {		
				
			if(Character.isDigit(ch[i])) {
					
				int value =Character.getNumericValue(ch[i]);
				for(int j=0; j<value; j++) {
					System.out.print(ch[i-1]+" ");
				}					
			}		
			System.out.println("");
		}
	}
}
