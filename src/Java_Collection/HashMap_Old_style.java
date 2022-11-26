package Java_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Old_style {
	public static void main(String args[]) {
		Map map = new HashMap();
		map.put(1, "Text_1");
		map.put(2, "Text_2");
		map.put(3, "Text_3");
		map.put(4, "Text_4");
		Set<String> set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			System.out.println(entry.getKey()+"  "+ entry.getValue());
		}
	}
}
