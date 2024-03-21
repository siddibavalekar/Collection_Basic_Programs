package Set_programs;

import java.util.HashMap;

public class Copy_One_Map_TO_AnotherMap {
	public static void main(String[] args) {
		HashMap<Integer,String> ref=new HashMap<Integer,String>();
		ref.put(1, "red");
		ref.put(2, "blue");
		ref.put(3, "white");
		ref.put(4, "red");
		
		HashMap<Integer,String> ref1=new HashMap<Integer,String>();
		ref.put(5, "orange");
		ref.put(6, "dark blue");
		ref.put(7, "pink");
		ref.put(8, "offwhite");
		
		ref.putAll(ref1);
		
		System.out.print(ref);
	}

}
