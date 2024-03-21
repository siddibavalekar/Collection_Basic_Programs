package Set_programs;

import java.util.HashSet;

public class HashSetToArray {
public static void main(String[] args) {
	HashSet ref=new HashSet();
	ref.add("blue");
	ref.add("red");
	ref.add("black");
	ref.add("white");
	
//	System.out.println(ref);
	
	 String[] new_array = new String[ref.size()];
     ref.toArray(new_array);
	
	for(String element:new_array)
	{
		System.out.println(element);
	}
}
}
