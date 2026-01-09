package collection;

import java.util.HashMap;
 
import java.util.Map;

 

public class mapdemo {

	public static void main(String[] args) {
		 Map<Integer,String > map= new HashMap<Integer, String>();
		 
		 map.put(1, "Java");
		 map.put(2, "Python");
		 map.put(3, "c++");
		 
		 System.out.println(map);
		 
		Boolean a=map.containsValue("Java");
		 
		 System.out.println(a);
		 
	
		 
		 
		 System.out.println(map.size());
		 
		for(int i=1; i<=map.size(); i++)
		{
			System.out.println(map.get(i));
		 
		}
		 

	}

}
