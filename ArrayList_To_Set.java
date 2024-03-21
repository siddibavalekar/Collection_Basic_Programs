package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayList_To_Set {
	public static void main(String[] args) {
		ArrayList<String> ref=new ArrayList();
		ref.add("red");
		ref.add("green");
		System.out.println(ref);
		
		Set ref2=new HashSet(ref);
		
		for(String str:ref)
		{
			ref2.add(str);
		}
		System.out.println(ref2);
	}
	

}
