package Set_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Associate_elements_HashMap {
public static void main(String[] args) {
	HashMap<Integer,String> ref=new HashMap<Integer,String>();
	ref.put(1, "red");
	ref.put(2, "blue");
	ref.put(3, "white");
	ref.put(4, "red");
	
	System.out.println(ref);
	
	for(Map.Entry x:ref.entrySet())
	{
		System.out.println(x.getKey()+" "+ x.getValue());
	}
	
}
}
