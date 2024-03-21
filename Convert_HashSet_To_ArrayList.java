package Set_programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Convert_HashSet_To_ArrayList {
public static void main(String[] args) {
	HashSet ref=new HashSet();
	ref.add("blue");
	ref.add("red");
	ref.add("black");
	ref.add("white");
	
	System.out.println(ref);

	List<String>new_arraylist=new ArrayList(ref);
	System.out.println(new_arraylist);
	
	for(String ele:new_arraylist)
	{
		System.out.println(ele);
	}
}
}
