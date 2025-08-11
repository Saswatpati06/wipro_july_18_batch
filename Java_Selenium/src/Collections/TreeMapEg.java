package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import java.util.*;

public class TreeMapEg {
    public static void main(String[] args) {
      
        Map<Integer, String> map = new TreeMap<Integer, String>();

        
        map.put(1, "Satya");
        map.put(2, "Liku");
        map.put(3, "PKD");
        // map.put(null, null); // null pointer exception
        map.put(4, null);
        map.put(5, null);
        map.put(3, "Raja"); 

        
        System.out.println("Map (TreeMap): " + map);

        // Convert map to set
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
            
        }
    }
}


	


