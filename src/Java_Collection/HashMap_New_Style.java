package Java_Collection;

import java.util.HashMap;
import java.util.Map;

public class HashMap_New_Style {
	public static void main(String args[]) {
		Map<Integer, String> map =new HashMap<Integer,String>();
		map.put(100,"Text1");
		map.put(101,"Text2");
		map.put(103, "Text3");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}
}
