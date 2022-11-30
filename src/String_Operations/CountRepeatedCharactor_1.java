package String_Operations;

import java.util.Iterator;

public class CountRepeatedCharactor_1 {	
	public String S= "AAABBBBDDDDEEECCCFFUUUUIIIKKKKKLLM";
	public String SA[] = S.split("");
	public String SAM2[] = S.split("");
	public char Chars[];
	int i=0,j=0;
	
	public void Method_1() {
		System.out.println("String Array: ");
		for(i=0; i<SA.length;i++)
		{
			int count = 0;
			for(j=i+1; j<SA.length; j++)
			{
				if(SA[i].equals(SA[j]))
				{
					count++;
					SA[j] = "";
				}
			}
			if(count>=0 && SA[i]!="") {
				System.out.println(" SA: "+SA[i]+" "+(count+1));
			}
		}
		for(i=0; i<SA.length-1; i++) {
			System.out.print(SA[i]);
		}
	}
	
	

	public static void main(String args[]) {
		
		CountRepeatedCharactor_1 cr = new CountRepeatedCharactor_1();
		
		cr.Method_1();
		
	}
}




