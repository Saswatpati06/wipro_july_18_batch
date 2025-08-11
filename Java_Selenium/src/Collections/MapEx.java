package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class MapEx {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Map<Integer, String>map = new HashMap<Integer,String>();
		
		map.put(1,  "Satya");
		map.put(2,  "Liku");
		map.put(3,  "PKD");
		map.put(null, null);
		map.put(4, null);
		map.put(3,  "Raja");
		map.put(null, null);
		
		// System.out.println(map);
		
		// converting the map to the set
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Entry entry = (Map.Entry)itr.next();
			
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
		
	}

}
