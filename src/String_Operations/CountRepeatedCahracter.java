package String_Operations;

public class CountRepeatedCahracter {

	public static void main(String args[]) {
		 String S1="aaabbbbfffffdddddddrrrrrrrr";
		 
		 String spl[] = S1.split("");
		 System.out.println(spl.length);
		 
		 for(int i=0; i<spl.length; i++) {
			 
			 int count=0;
			 for(int j=i+1; j<spl.length; j++) {
				 
				 if(spl[i].equals(spl[j])) {
					 count++;
					 spl[j]="";
				 }				
			 }
			 if(count>=0 && spl[i]!="") {
				 System.out.print(spl[i]+(count+1)+" ");					 
			 }
		 }
	}	
}
