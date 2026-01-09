package collection;

import java.util.HashSet;
import java.util.Set;

public class set {
	public static void main(String[] args) {
		
		Set<String> set= new HashSet<String>();
		
		set.add("gopal");
		
		set.add("gap");
		set.add("mak");
		
		System.out.println(set);
		
		if (set.contains("gopal")) 
		
		{
			System.out.println("object sucessfully fetch");
		}
		
		else {
			System.out.println("object not found");
		}
		
		set.size();
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		
		set.remove("gap");
		
		System.out.println(set);
		
		
		 
	}

}
