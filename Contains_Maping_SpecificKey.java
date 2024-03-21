package Set_programs;

import java.util.HashMap;

public class Contains_Maping_SpecificKey {
	public static void main(String[] args) {
		
	
	HashMap<Integer,String> ref=new HashMap<Integer,String>();
	ref.put(1, "red");
	ref.put(2, "blue");
	ref.put(3, "white");
	ref.put(4, "black");
	
	if(ref.containsKey(3))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	
	if(ref.containsValue("red"))
	{
		System.out.println("value is present");
	}
	else
	{
		System.out.println("value is not present");
	}
	}
}
