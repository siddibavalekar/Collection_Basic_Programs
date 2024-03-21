package Set_programs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConvertHashSet_TreeSet {
public static void main(String[] args) {
	HashSet ref=new HashSet();
	ref.add("blue");
	ref.add("red");
	ref.add("black");
	ref.add("white");
	System.out.println(ref);
	
	Set <String> new_TreeSet=new TreeSet<String>(ref);
	
	System.out.println(new_TreeSet);
	
	for(String element : new_TreeSet)
	{
        System.out.println(element);
     }
	
}
}
