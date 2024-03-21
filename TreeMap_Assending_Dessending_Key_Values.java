package Set_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Assending_Dessending_Key_Values {
	public static void main(String[] args) {
		TreeMap <Integer,String> ref=new TreeMap();
		ref.put(1, "pink");
		ref.put(2, "blue");
		ref.put(3, "white");
		ref.put(4, "red");
		
		System.out.println(ref.descendingKeySet());
		for(Map.Entry x:ref.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
			
					
		}
		
		
			
		
	}

}
