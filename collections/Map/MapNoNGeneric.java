package com.collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Java Map Example: Non-Generic (Old Style)
public class MapNoNGeneric {
	public static void main(String[] args) {
		Map map = new HashMap();
		// Adding elements to map
		map.put(1, "Amit");
		map.put(5, "Rahul");
		map.put(2, "Jai");
		map.put(6, "Amit");
		// Traversing Map
		Set set = map.entrySet(); // Converting to Set so that we can traverse
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			// Converting to Map.Entry so that we can get key and value separately
			Map.Entry entity = (Map.Entry) itr.next();
			System.out.println(entity.getKey() + " " + entity.getValue());
		}

	}
}
