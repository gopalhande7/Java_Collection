package collection;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		
		 List<Integer> list= new ArrayList<Integer>();
		 
		 list.add(1);
		 list.add(2);
		 list.add(3);
		 
		 System.out.println(list);
		 
		 System.out.println(list.get(2));
		 
		 System.out.println(list.size());
		 
		 list.remove(2);
		 
		 System.out.println(list);
 		 
		
		 list.add(4);
		 
		 System.out.println(list);
		 
		 list.add(3, 3);
		 
		 System.out.println(list);
		 
		 list.set(1, 11);
		 System.out.println(list);
		 
			}

}
